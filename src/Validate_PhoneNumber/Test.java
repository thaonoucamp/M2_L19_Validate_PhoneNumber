package Validate_PhoneNumber;

import java.util.regex.Matcher;

public class Test {
    public static void main(String[] args) {
        CheckValidPhone test = new CheckValidPhone();

        String str = "(d)-(ddddddddd)";
        System.out.println(str + " is valid " + test.validate(str));
    }
}
