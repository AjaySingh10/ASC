import java.io.IOException;
import java.io.File;

class sort {
    create cr=new create();                 //for Data_file Creation containing Random number
    merge me=new merge();                   //object for Merge method
    insertion inss=new insertion();         //object for Insertion method
    quick qui = new quick();                //object for Quick method
    heap ho=new heap();                     //object for heap method
    static  table jt=new table();           //object for the jtable containing all the time
    static menu mu=new menu();              //object for menu(main page)

    public static void main(String[] args)throws IOException {
        sort.mu.setVisible(true);            //setting menu frame visible
    }

    public void recieve(String input,int a,int A1,int A2) throws IOException, InterruptedException {
        int in=Integer.parseInt(input);
        cr.data(in);                                //passing input to create method
        int fs =in/50000;                           //file split count
        Thread thread1 = new Thread() {
            public void run() {
                try {
                    ho.hop(fs);                     //calling heap method with the fs count
                } catch (IOException e) {
                    e.printStackTrace();
                }
                File f1 = new File("F:\\EXP.1\\Files\\split1.txt");
                File f2 = new File("F:\\EXP.1\\Files\\Heap_op.txt");
                f1.renameTo(f2);
            }
        };
        Thread thread2 = new Thread() {
            public void run() {
                try {
                    me.mop(fs);                     //calling merge method with the fs count
                } catch (IOException e) {
                    e.printStackTrace();
                }
                File f1 = new File("F:\\EXP.1\\Files\\split1.txt");
                File f2 = new File("F:\\EXP.1\\Files\\Merge_op.txt");
                f1.renameTo(f2);
            }
        };
        Thread thread3 = new Thread() {
            public void run() {
                try {
                    qui.qop(fs);                    //calling Quick method with the fs count
                } catch (IOException e) {
                    e.printStackTrace();
                }
                File f1 = new File("F:\\EXP.1\\Files\\split1.txt");
                File f2 = new File("F:\\EXP.1\\Files\\Quick_op.txt");
                f1.renameTo(f2);
            }
        };
        Thread thread4 = new Thread() {
            public void run() {
                try {
                    inss.iop(fs);
                } catch (IOException e) {
                    e.printStackTrace();
                }

                File f1 = new File("F:\\EXP.1\\Files\\split1.txt");
                File f2 = new File("F:\\EXP.1\\Files\\Insertion_op.txt");
                f1.renameTo(f2);
            }
        };


        if (a==1) {
            thread1.start();
            thread1.join();
            thread2.start();
            thread2.join();
            thread3.start();
            thread3.join();
            thread4.start();
        }

     if(A1==0||A2==0)
{
    thread2.start();
    if(A1==0)
    {
        thread2.join();
    }
}
 if(A1==1||A2==1)
{
    thread3.start();
   if(A1==1)
   {
    thread3.join();}
   }
  if(A1==2||A2==2)
{
    thread1.start();
    if(A1==2)
    {
        thread1.join();}
}
        if(A1==3||A2==3)
        {
            thread4.start();
            if(A1==3)
            {
                thread4.join();}
        }
}}
