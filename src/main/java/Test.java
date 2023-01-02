
import java.util.LinkedHashSet;
import java.util.Set;

public class Test {

    public boolean check(String sentence) {
        //code
        char[] chars = sentence.toLowerCase().replaceAll("[^a-z]", "").toCharArray();
        Set<Character> charSet = new LinkedHashSet<>();
        for (char c : chars) {
            charSet.add(c);
        }
        return charSet.size() == 26;
    }

    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
