package HomeWork1.ex2;

public class FacManager {
    public static void main(String[] args) {
        Fac fac_1 = new Fac();
        Fac fac_2 = new Fac();

        System.out.println("Nhap phan so thu nhat: ");
        fac_1.input();

        System.out.println("Nhap phan so thu hai: " );
        fac_2.input();

        System.out.print("Phan so thu nhat: ");
        fac_1.output();

        System.out.print("Phan so thu hai: ");
        fac_2.output();

        System.out.print("Tong hai phan so: ");
        Fac sum = fac_1.sum(fac_2);
        sum.output();

        System.out.print("Hieu hai phan so: ");
        Fac subtract = fac_1.subtract(fac_2);
        subtract.output();

        System.out.print("Tich hai phan so: ");
        Fac multiply = fac_1.multiply(fac_2);
        multiply.output();

        System.out.print("Thuong hai phan so: ");
        Fac divide = fac_1.divide(fac_2);
        divide.output();

        System.out.println("Phan so thu nhat la phan so " +(fac_1.isPositiveFraction() ? "Duong" : "Am") + ".");

        System.out.println("Phan so thu hai la phan so " +(fac_2.isPositiveFraction() ? "Duong" : "Am") + ".");

        System.out.println("Phan so thu nhat " + (fac_1.isZeroFraction() ? "= 0" : "!= 0") + ".");

        System.out.println("Phan so thu hai " + (fac_2.isZeroFraction() ? "= 0" : "!= 0") + ".");
    }
}
