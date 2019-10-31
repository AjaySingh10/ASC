import java.io.File;
import java.io.IOException;

public class merge {
    int array1[],array2[], temp[];
table jt=new table();

    void merge(int arr[], int beg, int mid, int end) {
        int l = mid - beg + 1;
        int r = end - mid;

        int LeftArray[] = new int[l];
        int RightArray[] = new int[r];

        for (int i = 0; i < l; ++i)
            LeftArray[i] = arr[beg + i];
        for (int j = 0; j < r; ++j)
            RightArray[j] = arr[mid + 1 + j];


        int i = 0, j = 0;
        int k = beg;
        while (i < l && j < r) {
            if (LeftArray[i] <= RightArray[j]) {
                arr[k] = LeftArray[i];
                i++;
            } else {
                arr[k] = RightArray[j];
                j++;
            }
            k++;
        }
        while (i < l) {
            arr[k] = LeftArray[i];
            i++;
            k++;
        }

        while (j < r) {
            arr[k] = RightArray[j];
            j++;
            k++;
        }
    }

    void msort(int arr[], int beg, int end) {
        if (beg < end) {
            int mid = (beg + end) / 2;
            msort(arr, beg, mid);
            msort(arr, mid + 1, end);
            merge(arr, beg, mid, end);
        }
    }

    public int[] let(int[] arr) {
        merge mo = new merge();
        mo.msort(arr, 0, arr.length - 1);
        return arr;
    }
    public void  mop(int fs) throws IOException {

        convert co=new convert();
        Add_and_make ad=new Add_and_make();

        split s=new split();
        s.div();
        int ex=fs,c=1,el=0;
        while(ex!=1)
        {
            c++;
            ex=ex/2;
        }
        el=c;
        float mtime[]=new float[2*fs-1];
        int t=0;
        for(int i=0;i<c;i++)
        {
            int ufno=0;
            for(int j=1;j<=fs;j++)
            {
                File tempFile = new File("F:\\EXP.1\\Files\\split"+(j+1)+".txt");
                boolean exists = tempFile.exists();
                long startTime,endTime,timeElapsed;
                if(j%2==1 && exists== true)
                {
                    array1=co.con(j);
                     startTime = System.nanoTime();
                      array1=let(array1);
                     endTime = System.nanoTime();
                     timeElapsed = endTime - startTime;
                    long mtt=timeElapsed/1000000;
                    mtime[t]=mtt/1000f;
                    File del = new File("F:\\EXP.1\\Files\\split"+j+".txt");
                    del.delete();
                    t++;
                }

                else if(j%2==0)
                {
                    ufno++;
                    array2=co.con(j);
                    startTime = System.nanoTime();
                    array2=let(array2);
                    endTime = System.nanoTime();
                    timeElapsed = endTime - startTime;
                    long mtt=timeElapsed/1000000;
                    mtime[t]=mtt/1000f;
                    ad.add(array1,array2,ufno);
                    File del = new File("F:\\EXP.1\\Files\\split"+j+".txt");
                    del.delete();
                    t++;

                }
                else if(c==el)
                {
                    array1=co.con(j);
                    startTime = System.nanoTime();
                    array1=let(array1);
                    endTime = System.nanoTime();
                    timeElapsed = endTime - startTime;
                    long mtt=timeElapsed/1000000;
                    mtime[t]=mtt/1000f;
                }
            }
            fs=fs/2;
        } float sum=0;
        for(int i=0;i<mtime.length;i++)
        {
            sum=sum+mtime[i];
        }
       sort.mu.jLabel4.setVisible(true);
        sort.mu.jLabel9.setText(String.valueOf(sum)+" s");
        sort.jt.mtable(mtime);

    }

}