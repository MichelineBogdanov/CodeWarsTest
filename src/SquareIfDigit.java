/*Welcome. In this kata, you are asked to square every digit of a number and concatenate them.
For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.
Note: The function accepts an integer and returns an integer*/

public class SquareIfDigit {

    public static void main(String[] args) {
        int a = 4873;
        System.out.println(squareDigits(a));
    }

    public static int squareDigits(int n) {
// TODO Implement me
        String str = String.valueOf(n);
        char[] chars = str.toCharArray();
        int[] ints = new int[chars.length];
        String result = "";
        for (int i = 0; i < chars.length; i++) {
            int numericValue = Character.getNumericValue(chars[i]);
            ints[i] = (int) Math.pow(numericValue, 2);
            result = result.concat(String.valueOf(ints[i]));
        }
        return Integer.parseInt(result);
    }

}

