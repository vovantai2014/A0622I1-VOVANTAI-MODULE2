package ss_19_string_regex.bai_tap.validate_tenlophoc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassExample {
//    Bắt đầu bằng một ký tự chữ hoa C hoặc A hoặc P
//    Không chứa các ký tự đặc biệt
//    Theo sau ký tự bắt đầu là 4 ký tự số
//    Kết thúc phải là 1 trong những ký tự chữ hoa sau: G, H, I, K, L, M

    private static final String CLASS_REGEX = "^[ACP]+[0-9]{4,}+[GHIKLM]$";

    public ClassExample(){

    }
    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();

    }
}
