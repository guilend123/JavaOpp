package Homework11.Ex1;
import java.io.*;

public class ExC {
    public static void main(String[] args) throws IOException {
        // c. Viết chương trình đếm số lần xuất hiện của 1 từ nào đó trong 1 file.txt. Mỗi từ được đặt ở trên 1 dòng của file.txt.
        File file = new File("src/Homework11/Ex1/hihi.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String key = "có";

        String line;

        int count = 0;

        while ((line = bufferedReader.readLine()) != null) {
            String[] lineRead = line.split(" ");
            for (String word : lineRead) {
                if (key.equalsIgnoreCase(word)) {
                    count++;
                }
            }
        }

        System.out.println("Số lần xuất hiện của từ [" + key + "] trong file là : " + count);

        bufferedReader.close();
    }
}
