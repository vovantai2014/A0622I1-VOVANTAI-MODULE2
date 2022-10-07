package ss11_stack_queue.bai_tap.reverse_int_usestack;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;
import java.util.Stack;

public class ReverseArrayUseStack {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        String input = "";
        String output = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Reverse Integer Array.");
        System.out.print("Input number of elements of the array :");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Input elements " + (i) + " :");
            array[i] = sc.nextInt();
            String temp = sc.nextLine();
        }

        for (int i = 0; i < n; i++) {
            input += integerStack.push(array[i]);
        }
        System.out.println("Input Integer Array : " + input);
        while (!integerStack.isEmpty()) {
            output += integerStack.pop();
        }
        System.out.println("Reverse Integer Array :" + output + " ");

        Stack<String> stringStack = new Stack<>();
        System.out.print("Input String :");
        String string = sc.nextLine();
        for (int i = 0; i < string.length(); i++) {
            stringStack.push(string.charAt(i) + "");
        }
        while (!stringStack.isEmpty()) {
            System.out.print(stringStack.pop());
        }
    }
}
