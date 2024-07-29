package Homework2.ex3;

public class MangerStudent {
    public static void main(String[] args) {
        Student student = new Student(1, "Nguyen Tran Van Hieu", 9);

        System.out.println("Before");
        System.out.println("ID: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Score: " +student.getScore());

        student.setName("Hieu ne");
        student.setScore(10);

        System.out.println("After");
        System.out.println("ID: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Score: " +student.getScore());
    }
}
