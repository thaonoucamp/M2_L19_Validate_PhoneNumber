package Validate_PhoneNumber;

// Kiểm tra tính hợp lệ của số điện thoại;
// Yêu cầu: (xx)-(0xxxxxxxxx); x là ký tự/ ko chứa ký tự đặc biêt;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckValidPhone {

    private static final String PHONE_NUMBER_REGEX = "^\\([0-9]{2}\\)-\\(0[0-9]{9}\\)$";
    private static final String PHONE1_NUMBER_REGEX = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";

    public CheckValidPhone() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(PHONE_NUMBER_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
