
/*
 * Introduction
 * There is a war and nobody knows - the alphabet war!
 * There are two groups of hostile letters. The tension
 * between left side letters and right side letters was too high and the war began.
 * Task
 * Write a function that accepts fight string consists of only small letters and
 * return who wins the fight. When the left side wins return Left side wins!,
 * when the right side wins return Right side wins!, in other case return Let's fight again!.
 * The left side letters and their power:
 * w - 4
 * p - 3
 * b - 2
 * s - 1
 * The right side letters and their power:
 * m - 4
 * q - 3
 * d - 2
 * z - 1
 * The other letters don't have power and are only victims.
 * Example
 * AlphabetWar("z");        //=> Right side wins!
 * AlphabetWar("zdqmwpbs"); //=> Let's fight again!
 * AlphabetWar("zzzzs");    //=> Right side wins!
 * AlphabetWar("wwwwwwz");  //=> Left side wins!
 * */

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class AlphabetWar {

    public static Map<Character, Integer> leftSide = new HashMap<>() {{
        put('w', 4);
        put('p', 3);
        put('b', 2);
        put('s', 1);
    }};
    public static Map<Character, Integer> rightSide = new HashMap<>() {{
        put('m', -4);
        put('q', -3);
        put('d', -2);
        put('z', -1);
    }};

    public static void main(String[] args) {
        System.out.println(alphabetWar("z"));
        System.out.println(alphabetWar("zdqmwpbs"));
        System.out.println(alphabetWar("zzzzs"));
        System.out.println(alphabetWar("wwwwwwz"));
    }

    public static String alphabetWar(String fight) {
        AtomicInteger left = new AtomicInteger(0);
        AtomicInteger right = new AtomicInteger(0);
        fight.chars()
                .mapToObj(c -> (char) c)
                .forEach(c -> {
                    if (leftSide.containsKey(c)) {
                        left.set(left.get() + leftSide.get(c));
                    } else if (rightSide.containsKey(c)) {
                        right.set(right.get() + rightSide.get(c));
                    }
                });
        if (left.get() > right.get()) {
            return "Left side wins!";
        } else if (left.get() < right.get()) {
            return "Right side wins!";
        } else {
            return "Let's fight again!";
        }
    }
}
