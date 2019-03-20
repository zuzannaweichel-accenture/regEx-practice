package regEx.practice;

import java.util.regex.Pattern;

public class PhoneNumberValidator {
    public boolean validateNumber(String number) {
        String regEx = "^\\+?\\d*\\s?-?[\\s\\(-](\\d{3}|\\d{2})[\\s\\)-]\\s?(\\d{3}|\\d{4})[-\\s](\\d{4})$"; //^(\(?\+?[0-9]*\)?)?[0-9_\- \(\)]*$
        return Pattern.matches(regEx,number);
    }
}
