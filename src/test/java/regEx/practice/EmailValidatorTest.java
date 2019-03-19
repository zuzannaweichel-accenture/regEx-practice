package regEx.practice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EmailValidatorTest {

    @Test
    public void is_ValidEmail(){
        EmailValidator validator = new EmailValidator();
        String email = "person@example.com";
        assertTrue(validator.validateEmail(email));
    }

}
