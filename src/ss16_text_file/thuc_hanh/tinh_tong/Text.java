package ss16_read_write_file.thuc_hanh.tinh_tong;

import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        System.out.println("Nhap duong dan file :");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();

        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText(path);
    }
}
