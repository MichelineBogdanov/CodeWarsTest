import java.util.*;

public class Count {

    public String toJade(String phrase) {
        if (phrase == null || phrase.equals(" ")) {
            return null;
        } else {
            String[] words = phrase.split(" ");
            for (int i = 0; i < words.length; i++) {
                words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
            }
            return String.join(" ", words);
        }
    }

}

