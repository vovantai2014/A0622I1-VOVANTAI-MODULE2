package ss4_class_object_in_java.thuc_hanh;

import java.util.Scanner;

class Rectangle {
    double length;
    double width;

    Rectangle() {
        length = 1;
        width = 1;
    }

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double getArea() {
        return this.length * this.width;
    }

    double getPerimeter() {
        return (this.length + this.width) * 2;
    }
}

public class TestRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai length :");
        int length = sc.nextInt();
        System.out.print("Nhap chieu rong :");
        int width = sc.nextInt();
        Rectangle rect1 = new Rectangle(length, width);
        System.out.print("Area :" + rect1.getArea() + "\t");
        System.out.print("Perimeter :" + rect1.getPerimeter());

        Rectangle rect2 = new Rectangle(7, 8);
        System.out.print("Area 2: " + rect2.getArea() + "\t");
        System.out.print("Perimeter 2: " + rect2.getPerimeter());
    }
}




