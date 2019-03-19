/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package regEx.practice;

import java.util.regex.Pattern;

public class RegularExpression {

    public String validateCreditCard(String creditCard) {
        String number = removeWhiteSpacesAndDashes(creditCard);
        String cardProvider = "";
        if (Pattern.matches("^4[0-9]{12}(?:[0-9]{3})?$",number)){
            cardProvider = "VISA";
        }else{
            cardProvider = "Not a valid Card Number";
        }
        return cardProvider;
    }
    private String removeWhiteSpacesAndDashes(String number){
        return number.replaceAll("[ -/]","");
    }
}