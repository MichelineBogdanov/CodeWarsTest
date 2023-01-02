
//Are You Playing Banjo?
/*
Create a function which answers the question "Are you playing banjo?".
If your name starts with the letter "R" or lower case "r", you are playing banjo!
*/

import java.util.Locale;

public class Banjo {

    public static void main(String[] args) {
        String substring = "qwerty".substring(0, 1);
        System.out.println(substring);
        System.out.println(areYouPlayingBanjo2("Rino"));
        System.out.println(areYouPlayingBanjo2("rino"));
        System.out.println(areYouPlayingBanjo2("Misha"));
        System.out.println(areYouPlayingBanjo2(""));

    }

    public static String areYouPlayingBanjo(String name) {
        if (name.length() > 0) {
            String substring = name.substring(0, 1);
            return substring.equalsIgnoreCase("r") ? name + " plays banjo" : name + " does not play banjo";
        } else {
            return " does not play banjo";
        }
    }

    public static String areYouPlayingBanjo2(String name) {
        char[] chars = name.toLowerCase(Locale.ROOT).toCharArray();
        if (chars.length > 0) {
            return chars[0] == 'r' ? name + " plays banjo" : name + " does not play banjo";
        } else {
            return " does not play banjo";
        }
    }

}
