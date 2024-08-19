package Homework9.Set;
import java.util.HashSet;

public class ExB {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 2, 1, 6};

        HashSet<Integer> uniqueSet = new HashSet<>();
        int sum = 0;

        for ( int num : arr){
            if ( !uniqueSet.contains(num)){
                uniqueSet.add(num);
                sum += num;
            }
        }
        System.out.println("SUM: " + sum);
    }
}
