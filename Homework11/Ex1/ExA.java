package Homework11.Ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExA {
    public static void main(String[] args) throws IOException {
        //a. Viết chương trình đọc vào tất cả các dòng của 1 file.txt.txt. Sau đó hiển thị tất cả thông tin đọc được trên cùng 1 dòng.
        File file = new File("src/Homework11/Ex1/hihi.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.print(line);
        }
        bufferedReader.close();
    }
}
