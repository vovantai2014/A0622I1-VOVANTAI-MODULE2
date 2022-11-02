package ss_19_string_regex.bai_tap.validate_sodienthoai_nhaptubanphim;

import java.awt.print.PrinterException;
import java.io.IOException;
import java.util.Scanner;

public class PhoneNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneNumberCheck phoneNumberCheck = new PhoneNumberCheck();

        System.out.print("Nhap so dien thoai theo dinh dang (xx-xxxxxxxxxx) :");
        String str = scanner.nextLine();
        phoneNumberCheck.checkPhoneNumber(str);
        scanner.close();
    }
}
