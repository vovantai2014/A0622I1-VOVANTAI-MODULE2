package ss4_class_object_in_java.bai_tap.fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3, 10, "yelow", true);// Khoi tao doi tuong Fan1
        Fan fan2 = new Fan(2, 5, "blue", false);// Khoi tao doi tuong Fan2
        System.out.println("Fan 1 :" + fan1.toString() + "\t");
        System.out.println("Fan 2 :" + fan2.toString());
    }
}
