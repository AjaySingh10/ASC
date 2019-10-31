import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class split {

   public void div()
   {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("F:\\EXP.1\\Files\\Data_file.txt"));
            String line;
            int x=0,count=50000,i=0,fc,q,m;
            while ((line = br.readLine()) != null) {
                String strArray[] = line.split(" ");
                x = strArray.length;
                fc=x/50000;
                for(m=1;m<=fc;m++) {
                    String[] f1 = Arrays.copyOfRange(strArray, i, count);
                    String p="F:\\EXP.1\\Files\\split"+m+".txt";
                    FileWriter fileWriter = new FileWriter(p);
                    for (q = 0; q<f1.length; q++)
                    {
                        String s=String.valueOf(f1[q]);
                        fileWriter.write(s+" ");
                    }
                    fileWriter.close();
                    i=count;
                    count=count+50000;
                }
            }



        } catch (IOException e) {
            e.printStackTrace();
        }

        finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}