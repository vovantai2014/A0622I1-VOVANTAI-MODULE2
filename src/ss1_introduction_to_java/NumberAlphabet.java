package Introduction_to_java;

import java.util.Scanner;

public class NumberAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int alphabet;
        System.out.println("Nhap so co 3 chu so:");
        number = sc.nextInt();

        int a = (number % 10); // a: so hang don vi
        int b = ((number / 10) % 10); // b: chu so hang chuc
        int c = (number / 100); // c: chu so hang tram

        if (number < 100 || number > 999) {
            System.out.println("Nhap lai so co 3 chu so");
        } else {
            switch (c) {
                case 1:
                    System.out.println("One hundred");
                    break;
                case 2:
                    System.out.println("Two hundred");
                    break;
                case 3:
                    System.out.println("Three hundred");
                    break;
                case 4:
                    System.out.println("Four hundred");
                    break;
                case 5:
                    System.out.println("Five hundred");
                    break;
                case 6:
                    System.out.println("Six hundred");
                    break;
                case 7:
                    System.out.println("Seven hundred");
                    break;
                case 8:
                    System.out.println("Eight hundred");
                    break;
                case 9:
                    System.out.println("Nine hundred");
                    break;
            }
            if (b >= 10 && b < 20) {
                switch (b) {
                    case 0:
                        System.out.println("Ten");
                        break;
                    case 1:
                        System.out.println("Eleven");
                        break;
                    case 2:
                        System.out.println("Twelve");
                        break;
                    case 3:
                        System.out.println("Thirteen");
                        break;
                    case 4:
                        System.out.println("Fourteen");
                        break;
                    case 5:
                        System.out.println("Fifteen");
                        break;
                    case 6:
                        System.out.println("Sixteen");
                        break;
                    case 7:
                        System.out.println("Seventeen");
                        break;
                    case 8:
                        System.out.println("Eighteen");
                        break;
                    case 9:
                        System.out.println("Nineteen");
                        break;
                }

            }
            if (b >= 20 && b < 100) {
                switch (b) {
                    case 2:
                        System.out.println("Twenty");
                        break;
                    case 3:
                        System.out.println("Thirty");
                        break;
                    case 4:
                        System.out.println("Forty");
                        break;
                    case 5:
                        System.out.println("Fifty");
                        break;
                    case 6:
                        System.out.println("Sixty");
                        break;
                    case 7:
                        System.out.println("Seventy");
                        break;
                    case 8:
                        System.out.println("Eighty");
                        break;
                    case 9:
                        System.out.println("Ninety");
                        break;
                }
            }
            switch (a) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        }
    }
}




