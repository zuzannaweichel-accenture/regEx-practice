package regEx.practice;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PhoneNumberValidatorTest {
    private PhoneNumberValidator validator;

    @Before
    public void setup(){
        validator = new PhoneNumberValidator();
    }

    @Test
    public void isDomesticNumber1Valid(){
        String number = "(419) 890-0998";
        assertTrue(validator.validateNumber(number));
    }
    @Test
    public void isInternationalNumber1Valid(){
        String number = "+1-541-754-3010";
        assertTrue(validator.validateNumber(number));
    }
    @Test
    public void isInternationalNumberWithWhiteSpacesValid(){
        String number = "+1 419 890 0998";
        assertTrue(validator.validateNumber(number));
    }
    @Test
    public void isInternationalNumberWithAeraCodeValid(){
        String number = "+1 (419) 890 0998";
        assertTrue(validator.validateNumber(number));
    }
    @Test
    public void isInternationalNunberWithTwoDigitCountryCodeValid(){
        String number = "+44 20 7283 7907";
        assertTrue(validator.validateNumber(number));
    }
}
