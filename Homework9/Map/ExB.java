package Homework9.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ExB {

    public static void main(String[] args) {
        ArrayList<String> danhSachTen = new ArrayList<>();
        danhSachTen.add("Nguyen Hieu");
        danhSachTen.add("Van Hieu");
        danhSachTen.add("Hieu ne");
        Map<String, Integer> map = new HashMap<>();

        for (String name : danhSachTen) {
            name = name.toLowerCase();

            map.put(name, (map.getOrDefault(name,0) + 1));

        }

        System.out.println("Ten xuat hien 1 lan: ");
        for (String name : map.keySet()) {
            if (map.get(name) == 1) {
                System.out.println(name);
            }
        }

        System.out.println("Ten xuat hien nhieu lan: ");
        for (String name : map.keySet()) {
            if (map.get(name) > 1) {
                System.out.println(name + " - " + map.get(name) + " lan");
            }
        }
    }
}
