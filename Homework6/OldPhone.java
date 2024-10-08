package Homework6;

import Homework6.Phone;


import java.util.Scanner;

public class OldPhone extends Phone implements Discountable {
    private double pin;
    private String moreDescription;

    public OldPhone() {
    }



    public OldPhone(String id, String name, int price, int maintanceTime, String productor, double pin, String moreDescription) {
        super(id, name, price, maintanceTime, productor);
        this.pin = pin;
        this.moreDescription = moreDescription;
    }

    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hay nhap tinh trang pin:  ");
        this.pin = Double.parseDouble(scanner.nextLine());
        System.out.print("Hay nhap them thong tin mo ta:  ");
        this.moreDescription = scanner.nextLine();
    }

    public void output() {
        super.output();
        System.out.println("Pin: " + this.pin);
        System.out.println("Mo ta them: " + this.moreDescription);
    }

    @Override
    public void applyDiscount(double percentDiscount) {

    }

    private void setPrice(double discountPrice) {
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice();
    }
}
