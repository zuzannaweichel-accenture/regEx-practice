package regEx.practice;

import java.util.regex.Pattern;

public class EmailValidator {
    public boolean validateEmail(String email) {
        String emailRegEx = "^(.)+@(.)+\\.(.)+$";
        return Pattern.matches(emailRegEx,email);
    }
}
