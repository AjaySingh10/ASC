import java.io.File;
import java.io.IOException;

public class heap {
    int array1[],array2[], temp[];
   // table jt=new table();
        public void sort(int arr[])
        {
            int n = arr.length;

            for (int i = n / 2 - 1; i >= 0; i--)
                heapify(arr, n, i);

            for (int i=n-1; i>=0; i--)
            {
                // Move current root to end
                int temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;

                heapify(arr, i, 0);
            }
        }

        void heapify(int arr[], int n, int i)
        {
            int largest = i; // Initialize largest as root
            int l = 2*i + 1; // left = 2*i + 1
            int r = 2*i + 2; // right = 2*i + 2

            if (l < n && arr[l] > arr[largest])
                largest = l;

            if (r < n && arr[r] > arr[largest])
                largest = r;

            if (largest != i)
            {
                int swap = arr[i];
                arr[i] = arr[largest];
                arr[largest] = swap;

                heapify(arr, n, largest);
            }
        }

    public int[] he(int arr[])
        {
            int n = arr.length;
            heap h = new heap();
            h.sort(arr);
        return arr;
        }




    public void hop(int fs) throws IOException {
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
                    array1=he(array1);
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
                    array2=he(array2);
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
                    array1=he(array1);
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

        sort.mu.jLabel3.setVisible(true);
        sort.mu.jLabel8.setText(String.valueOf(sum)+" s");

        sort.jt.htable(mtime);
    }

}


