import java.io.*;

/**
 * Created by Nina Videtska on 15.10.2015.
 */

public class JustNum {
    public static void main(String[] args) throws IOException {
        String filename = "D://Java//Train//src//output.txt";
        File f = new File(filename);
        if (f.exists()) {
            f.delete();
            f.createNewFile();
        }
        BufferedReader bufferedReader = new BufferedReader(new FileReader("D://Java//Train//src//input.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename, true));

        int p = Integer.parseInt(bufferedReader.readLine());
        if (p < 0) bufferedWriter.write("false");
        else {
                for (int i = 2; i < p; i++) {
                    if (p % i == 0) {
                        bufferedWriter.write("false");
                        break;
                    } else {
                        if ((i == p - 1) && (p % i != 0)) {
                            bufferedWriter.write("true");
                        }
                    }
                }
            }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
