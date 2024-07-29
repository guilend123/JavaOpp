package HomeWork3.ex1;

public class ManagerStudent {
    public static void main(String[] args) {
        Student student1 = new Student(1,"Nguyen", 10);
        Student student2 = new Student(2,"Tran", 10);
        Student student3 = new Student(3,"Van Hieu", 10);
        Student student4 = new Student(3,"Ec Ec", 10);
        System.out.println("The number of student is: " + Student.getCount());
    }
}
