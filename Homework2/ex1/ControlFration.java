package Homework2.ex1;

public class ControlFration {
    public static void main(String[] args) {
        Fraction fraction = new Fraction();
        fraction.output();

        Fraction fraction1 = new Fraction(1 ,2);
        fraction1.output();

        Fraction fraction2 = new Fraction(3);
        fraction2.output();

        Fraction fraction3 = new Fraction(-12, -6);
        fraction3.output();

        Fraction fraction4 = fraction3.copy();
        fraction4.sum(20);
        fraction4.output();


    }
}
