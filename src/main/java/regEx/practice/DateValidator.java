package regEx.practice;

import java.util.regex.Pattern;

public class DateValidator {

    public boolean validateDate(String date) {

        String dateRegEx = "^(19|20)[0-9]{2}[- /.](0[1-9]|1[012])[- /.](0[1-9]|1[0-9]|2[0-9]|3[01])$";
        return Pattern.matches(dateRegEx,date);
    }

}
