package Homework8.MyQueue;

public class Main {public static void main(String[] args) {
    MyQueue<Integer> queue = new MyQueue<>();

    //a. add(): Thêm phần tử
    queue.add(15);
    queue.add(20);
    queue.add(25);
    queue.add(30);
    queue.add(35);
    queue.add(40);


    System.out.println("Danh sach ban dau: " + queue.toString());

    //b. peek (): Trả về thông tin đối tượng
    System.out.println(queue.peek());
    System.out.println(queue.peek());

    //c. pop(): lay ra xem va xoa
    while (!queue.isEmpty()) {
        System.out.println(queue.poll());
    }

    //d. isEmpty(): kiểm tra rỗng
    System.out.println("Ngan xep co rong khong: " + queue.isEmpty());

    //e. size(): trả về số lượng phần tử
    System.out.println("So luong phan tu la: " + queue.size());

}
}
