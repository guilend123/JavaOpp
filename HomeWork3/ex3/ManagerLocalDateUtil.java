package HomeWork3.ex3;

import java.time.LocalDate;

public class ManagerLocalDateUtil {
    public static void main(String[] args) {
        String dateString1 = "21/08/2017";
        String dateString2 = "2001/11/11";

        LocalDate date1 = LocalDateUtil.fromString_ddMMyyyy(dateString1);
        LocalDate date2 = LocalDateUtil.fromString_yyyyMMdd(dateString2);

        System.out.println("LocalDate tu chuoi dd/MM/yyyy: " + date1);
        System.out.println("LocalDate tu chuoi yyyy/MM/dd: " + date2);

        LocalDate currentDate = LocalDate.now();

        String formatterDate1 = LocalDateUtil.toString_ddMMyyyy(currentDate);
        String formatterDate2 = LocalDateUtil.toString_yyyyMMdd(currentDate);

        System.out.println("Chuoi tu LocalDate (dd/MM/yyyy): " + formatterDate1);
        System.out.println("Chuoi tu LocalDate (yyyy/MM/dd): " + formatterDate2);
    }
}
