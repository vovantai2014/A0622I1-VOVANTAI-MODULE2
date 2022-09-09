package Introduction_to_java;

import java.util.Scanner;

public class ShowGreetings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;

        System.out.println("Input name :");
        name = sc.nextLine();

        System.out.println("Hello " + name + " !");

    }
}
