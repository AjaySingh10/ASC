import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class convert {
    int[] arr;
    public int[] con(int len) throws IOException {

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("F:\\EXP.1\\Files\\split"+len+".txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String str[] = line.split(" ");
               arr = new int[str.length];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = Integer.parseInt(str[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return arr;
    }
}