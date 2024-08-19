package Homework8.MyStack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(25);
        stack.push(34);
        stack.push(55);

        System.out.println("Stack: "+ stack.toString());

//      b Peek(): lấy ra xem
        Integer value = stack.peek();
        System.out.println(value);
//      c. pop(): lấy ra xem và xóa
        Integer pop = stack.pop();
        System.out.println(pop);
//      d. isEmpty: kiểm tra xem stack có rỗng hay không
        boolean isEmpty = stack.isEmpty();
        System.out.println(" Stack is empty: : "+ isEmpty);
//      e. size(): kiểm tra size
        int size = stack.size();
        System.out.println(size);
    }
}
