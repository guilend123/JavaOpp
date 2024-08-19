package Homework6;

import Homework6.Phone;

import java.util.Scanner;

public class NewPhone extends Phone {
    private int number;
    private int quatity;


    public NewPhone() {
    }

    public NewPhone(String id, String name, int price, int maintanceTime, String productor, int number) {
        super(id, name, price, maintanceTime, productor);
        this.number = number;
    }

    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hay nhap so luong dien thoai co trong kho: ");
        this.number = scanner.nextInt();
    }

    public void output() {
        super.output();
        System.out.println("So luong: " + this.number);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * quatity;
    }


}
