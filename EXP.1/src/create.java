import java.io.*;
import java.util.Random;
public class create {
    public void data(int input)throws IOException
    {
        split sp=new split();
        Random randomGenerator = new Random();
        FileWriter fileWriter = new FileWriter("F:\\EXP.1\\Files\\Data_file.txt");
         int[] nums = new int[input+2];
        for (int i = 1; i <input+1; i++){
           nums[i] = randomGenerator.nextInt(4000);
            String s=String.valueOf(nums[i]);
            fileWriter.write(s+" ");
            }
        fileWriter.close();

        }
}
