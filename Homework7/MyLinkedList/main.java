package Homework7.MyLinkedList;

public class main {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList();
        //a
        myLinkedList.addFirst(10);
        myLinkedList.addFirst(20);
        myLinkedList.addFirst(30);
        //b
        System.out.println("Danh sách đứng đầu"+ myLinkedList.toString());
        //c
        myLinkedList.addLast(60);
        myLinkedList.addLast(75);
        //d
        myLinkedList.add(2,24);
        System.out.println("Danh sách khi thêm 24 vào vị trí thứ 2 là: " + myLinkedList.toString());
        //e
        myLinkedList.removeFirst();
        System.out.println("Danh sách khi xóa phần tử đầu tiên là: " + myLinkedList.toString());
        //f
        myLinkedList.removeLast();
        System.out.println("Danh sách khi xóa phần tử cuối cùng là: " + myLinkedList.toString());
        //g
        myLinkedList.remove(2);
        System.out.println("Danh sách khi xóa phần tử thứ 2 là: " + myLinkedList.toString());
        //h
        int firstElement = myLinkedList.getFirst();
        System.out.println("Phần tử đầu tiên trong danh sách là: " + firstElement);
        //i
        int lastElement = myLinkedList.getLast();
        System.out.println("Phần tử cuối cùng trong danh sách là: " + lastElement);
        //j
        int elementIndex = myLinkedList.get(3);
        System.out.println("Phần tử tại ví trí thứ 3 trong danh sách là: " + elementIndex);
        //k
        myLinkedList.set(0,33);
        System.out.println("Vị trí thứ 0 thay thành phẩn tử 33 là: " + myLinkedList.toString());
        //l indexof
        int indexOfElement = myLinkedList.indexOf(20);
        System.out.println("Vị trí phần tử 33 là: " + indexOfElement);
        //m
        int lastIndexOfElement= myLinkedList.lastIndexOf(25);
        System.out.println("Vị trí cuối cùng của phần tử 25 trong dãy là " + lastIndexOfElement);

    }
}
