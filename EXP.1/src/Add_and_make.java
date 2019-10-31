import java.io.FileWriter;
import java.io.IOException;
public class Add_and_make {
    public void add(int[] a1,int[] a2,int i) throws IOException {
        int[] next = new int[a1.length+a2.length];
        System.arraycopy(a1, 0, next, 0, a1.length);
        System.arraycopy(a2, 0, next,a1.length,a2.length);
        make(next,i);
    }

    public void make(int [] af,int no)throws IOException
    {
        FileWriter fileWriter = new FileWriter("F:\\EXP.1\\Files\\split"+no+".txt");
        for (int i =0; i <af.length; i++){
            String s=String.valueOf(af[i]);
            fileWriter.write(s+" ");
        }
        fileWriter.close();
    }
}
