package Homework9.Map;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class ExA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay nhap van ban: ");
        String text = scanner.nextLine();

        Map<String, Integer> worldCount = new HashMap<>();

        String[] words = text.split(" ");

        for (String word : words) {
            word = word.toLowerCase();

            if (worldCount.containsKey(word)) {
                worldCount.put(word, worldCount.get(word) + 1);
            } else {
                worldCount.put(word, 1);
            }
        }

        for (String word : worldCount.keySet()) {
            System.out.println(word + ":" + worldCount.get(word));
        }

    }
}