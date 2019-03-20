package regEx.practice;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DateValidatorTest {

    @Test
    public void is_dateWithDashesValid(){
        DateValidator validator = new DateValidator();
        String date = "1950-05-04";
        assertTrue(validator.validateDate(date));
    }

    @Test
    public void is_dateWithSlashesValid(){
        DateValidator validator = new DateValidator();
        String date = "1950/05/04";
        assertTrue(validator.validateDate(date));
    }

    @Test
    public void is_dateWithDotsValid(){
        DateValidator validator = new DateValidator();
        String date = "1950.05.04";
        assertTrue(validator.validateDate(date));
    }

    @Test
    public void fakeMonthFails(){
        DateValidator validator = new DateValidator();
        String date = "1950/14/04";
        assertFalse(validator.validateDate(date));
    }

    @Test
    public void fakedayFails(){
        DateValidator validator = new DateValidator();
        String date = "1950/11/38";
        assertFalse(validator.validateDate(date));
    }

}
