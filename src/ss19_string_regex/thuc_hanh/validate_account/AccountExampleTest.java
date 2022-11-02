package ss_19_string_regex.thuc_hanh.validate_account;

import java.util.Scanner;

public class AccountExampleTest {
    private static AccountExample accountExample;
    public static final String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456", "ahadkadja"};
    public static final String[] invalidAccount = new String[]{".@", "12345", "6575", "bbjhn"};

    public static void main(String[] args) {
        accountExample = new AccountExample();
        for (String account : validAccount) {
            boolean isvalid = accountExample.validate(account);
            System.out.println("Account is " + account + "is valid :" + isvalid);
        }
        for (String acount : invalidAccount) {
            boolean isvalid = accountExample.validate(acount);
            System.out.println("Account is " + acount + "is valid " + isvalid);

        }
    }

}
