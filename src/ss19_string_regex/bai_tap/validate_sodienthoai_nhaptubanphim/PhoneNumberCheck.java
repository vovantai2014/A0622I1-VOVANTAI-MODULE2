package ss_19_string_regex.bai_tap.validate_sodienthoai_nhaptubanphim;

public class PhoneNumberCheck {
    public void checkPhoneNumber (String str){
        String regex = "[0-9]{2}-[0-9]{10}$";
        boolean check = str.matches(regex);

        if(check){
            System.out.print("Dung dinh dang so dien thoai");
        }else {
            System.out.print("Khong dung dinh dang so dien thoai");
        }
    }
}
