import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverceWord {
    public static void main(String[] args) {
        System.out.println(reverseSentence("eating like I"));

    }

    public static String reverseWords(String original) {
        String[] list = original.split(" ", -1);
        for (int i = 0; i < list.length; i++) {
            list[i] = new StringBuilder(list[i]).reverse().toString();
        }
        return String.join(" ", list);
    }

    public static String reverseSentence(String original) {
        String[] list = original.split(" ");
        for (int i = 0; i < list.length / 2; i++) {
            String prom = list[i];
            list[i] = list[list.length - i - 1];
            list[list.length - i - 1] = prom;
        }
        return String.join(" ", list);
    }
}
