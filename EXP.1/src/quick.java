import java.io.File;
import java.io.IOException;

public class quick
{table jt=new table();
    int partition(int arr[], int begin, int end)
    {
        int pivot = arr[end];
        int i = (begin-1); // index of smaller element
        for (int j=begin; j<end; j++)
        {
            // If current element is smaller than the pivot
            if (arr[j] < pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[end] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;

        return i+1;
    }


    void qsort(int arr[], int begin, int end)
    {
        if (begin < end)
        {
            int pi = partition(arr, begin, end);
            qsort(arr, begin, pi-1);
            qsort(arr, pi+1, end);
        }
    }


    public int[] qu(int arr[])
    {
        int n = arr.length;
        quick q = new quick();
        q.qsort(arr, 0, n-1);
        return arr;
}


    int array1[],array2[], temp[];
    public void  qop(int fs) throws IOException {
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
        {    int ufno=0;
            for(int j=1;j<=fs;j++)
            {
                File tempFile = new File("F:\\EXP.1\\Files\\split"+(j+1)+".txt");
                boolean exists = tempFile.exists();
                long startTime,endTime,timeElapsed;
                if(j%2==1 && exists== true)
                {
                    array1=co.con(j);
                    startTime = System.nanoTime();
                    array1=qu(array1);
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
                    array2=qu(array2);
                    endTime = System.nanoTime();
                    timeElapsed = endTime - startTime;
                    long mtt=timeElapsed/1000000;
                    mtime[t]=mtt/1000f;
                    File del = new File("F:\\EXP.1\\Files\\split"+j+".txt");
                    del.delete();
                    ad.add(array1,array2,ufno);
                    t++;
                }
                else if(c==el)
                {
                    array1=co.con(j);
                    startTime = System.nanoTime();
                    array1=qu(array1);
                    endTime = System.nanoTime();
                    timeElapsed = endTime - startTime;
                    long mtt=timeElapsed/1000000;
                    mtime[t]=mtt/1000f;
                }
            }
            fs=fs/2;
        }
        float sum=0;
        for(int i=0;i<mtime.length;i++)
        {
            sum=sum+mtime[i];
        }
        sort.mu.jLabel5.setVisible(true);
        sort.mu.jLabel10.setText(String.valueOf(sum)+" s");

sort.jt.qtable(mtime);
    }




}

