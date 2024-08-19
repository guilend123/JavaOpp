package Homework11.Ex1;

import java.io.*;

public class ExF {
    public static void main(String[] args) throws IOException {
        //f. Viết chương trình đổi tên 1 file.txt hoặc 1 thư mục cho trước.
        File oldFile = new File("src/Homework11/Ex1/hihi.txt");

        File newFile = new File("src/Homework11/Ex1/wisadel.txt");

        if (oldFile.exists()) {
            if(oldFile.renameTo(newFile)){
                System.out.println("Doi ten thanh cong.");
            }else{
                System.out.println("Doi ten that bai.");
            }
        } else {
            System.out.println("Tep hoac thu muc khong ton tai");
        }
    }
}
