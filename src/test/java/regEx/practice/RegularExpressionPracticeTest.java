/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package regEx.practice;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RegularExpressionPracticeTest {

    private RegularExpressionPractice regEx;

    @Before
    public void setup(){
        regEx = new RegularExpressionPractice();
    }

    @Test
    public void is_ValidVisa() {
        String visa = "4123-1234-2500-0966";
        String fake = "3123 2222 0000 53";

        assertEquals("VISA",regEx.validateCreditCard(visa));
        assertEquals("Not a valid Card Number", regEx.validateCreditCard(fake));
    }
    @Test
    public void is_ValidMasterCard(){
        String mc = "2223 8989 0900 7897";
        String fake = "3123 2222 0000 53";

        assertEquals("MasterCard", regEx.validateCreditCard(mc));
        assertEquals("Not a valid Card Number", regEx.validateCreditCard(fake));
    }
}