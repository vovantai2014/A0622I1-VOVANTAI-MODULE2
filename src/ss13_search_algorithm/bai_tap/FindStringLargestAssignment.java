package ss13_search_algorithm.bai_tap;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class FindStringLargestAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập dòng chữ: ");
        String input = sc.nextLine();
        ArrayList<Character> max = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(input.charAt(i));
            for (int j = i + 1; j < input.length(); j++) {
                if (input.charAt(j) > list.getLast()) {
                    list.add(input.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }

        for (Character ch : max) {
            System.out.print(ch);
        }
        System.out.println();
    }

}
