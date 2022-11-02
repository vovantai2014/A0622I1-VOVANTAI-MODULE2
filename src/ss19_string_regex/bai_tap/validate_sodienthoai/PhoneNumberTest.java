package ss_19_string_regex.bai_tap.validate_sodienthoai;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class PhoneNumberTest {
    private static PhoneNumberExample phoneNumberExample;

        public static final String [] validPhoneNumber = new String[]{"84-0905335344", "81-0986871261","73-0973113114"};
    public static final String [] invalidPhoneNumber = new String[]{"a8-0905335344", "831-09868712511","1234567890"};

    public static void main(String[] args) {
        phoneNumberExample = new PhoneNumberExample();

        for (String phoneNumber : validPhoneNumber) {
            boolean valid = phoneNumberExample.validate(phoneNumber);
            System.out.println("Phone number "+phoneNumber + " valid is "+ valid);
        }
        for (String phoneNumber: invalidPhoneNumber) {
            boolean valid = phoneNumberExample.validate(phoneNumber);
            System.out.println("Phone number "+phoneNumber + " valid is "+ valid);
        }
    }

}
