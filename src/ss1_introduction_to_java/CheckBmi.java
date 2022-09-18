package ss1_introduction_to_java;

import java.util.Scanner;

public class CheckBmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height, weight, bmi;

        System.out.println("Input height (is met) :");
        height = sc.nextDouble();

        System.out.println("Input weight (is kilogam) :");
        weight = sc.nextDouble();

        bmi = weight / Math.pow(height, 2);

        if (bmi < 18.5) {
            System.out.printf("Underweigth");
        } else if (bmi < 25) {
            System.out.printf("Normal");
        } else if (bmi < 30) {
            System.out.printf("Overweigth");
        } else {
            System.out.printf("Obese");
        }
    }
}
