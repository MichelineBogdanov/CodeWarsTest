package reg_exp;

/*
Implement String#digit? (in Java StringUtils.isDigit(String)),
which should return true if given object is a digit (0-9), false otherwise.
*/

import java.util.regex.Pattern;

public class IsDigit {

    public static void main(String[] args) {
        System.out.println(isDigit(""));
        System.out.println(isDigit("7"));
        System.out.println(isDigit(" "));
        System.out.println(isDigit("a5"));
        System.out.println(isDigit("14"));
    }

    public static boolean isDigit(String s) {
        // your code goes here
        return Pattern.matches("[0-9]", s);
    }

}
