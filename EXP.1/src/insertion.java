import java.io.File;
import java.io.IOException;

public class insertion {
    table jt=new table();
       public void isort(int arr[])
        {
            int n = arr.length;
            for (int i = 1; i < n; ++i) {
                int key = arr[i];
                int j = i - 1;
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = key;
            }
        }

  public int[] ins(int arr[])
        {
            insertion in = new insertion();
            in.isort(arr);
            return arr;
        }

        int array1[],array2[], temp[];

        public void  iop(int fs) throws IOException {
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
                        array1=ins(array1);
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
                        array2=ins(array2);
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
                        array1=ins(array1);
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
            sort.mu.jLabel6.setVisible(true);
            sort.mu.jLabel11.setText(String.valueOf(sum)+" s");

sort.jt.itable(mtime);

        }
    }










