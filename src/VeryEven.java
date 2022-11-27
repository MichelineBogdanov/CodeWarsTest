public class VeryEven {

    public static void main(String[] args) {
        System.out.println(isVeryEvenNumber1(999992));

    }

    public static boolean isVeryEvenNumber1(int number) {
        char[] arr = Integer.toString(number).toCharArray();
        int result = 0;
        for (char c : arr) {
            result += Integer.parseInt(Character.toString(c));
        }
        if (result > 9) {
            return isVeryEvenNumber1(result);
        } else {
            return result % 2 == 0;
        }
    }

}
