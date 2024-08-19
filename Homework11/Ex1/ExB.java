package Homework11.Ex1;
import java.io.*;
public class ExB {
    public static void main(String[] args) throws IOException {

        File file = new File("src/Homework11/Ex1/hihi.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;

        int count = 0;
        while ((line = bufferedReader.readLine()) != null && count < 3) {
            System.out.println(line);
            count++;
        }
        bufferedReader.close();
    }
}
