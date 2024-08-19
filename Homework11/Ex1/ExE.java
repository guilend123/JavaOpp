package Homework11.Ex1;

import java.io.*;

public class ExE {
    public static void main(String[] args) throws IOException {
        //e. Viết chương trình xóa 1 file.txt hoặc 1 thư mục cho trước.
        File file = new File("src/Homework11/Ex1/hihi.txt");

        if (file.exists()) {
            if(file.delete()){
                System.out.println("Da xoa thanh cong");
            }else{
                System.out.println("Khong the xoa");
            }
        } else {
            System.out.println("Duong dan khong ton tai");
        }
    }
}
