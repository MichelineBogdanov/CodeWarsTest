/*
Your goal in this kata is to implement a difference function, which subtracts one list from another
and returns the result.
It should remove all values from list a, which are present in list b keeping their order.
Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
If a value is present in b, all of its occurrences must be removed from the other:
Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayDiff {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2}, new int[]{1})));
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2, 2}, new int[]{1})));
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2, 2}, new int[]{2})));
        System.out.println(Arrays.toString(arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2})));
        System.out.println("--------------------");
        System.out.println(Arrays.toString(arrayDiff2(new int[]{1, 2}, new int[]{1})));
        System.out.println(Arrays.toString(arrayDiff2(new int[]{1, 2, 2}, new int[]{1})));
        System.out.println(Arrays.toString(arrayDiff2(new int[]{1, 2, 2}, new int[]{2})));
        System.out.println(Arrays.toString(arrayDiff2(new int[] {13, 22, 342, 2, 3}, new int[] {2})));
    }

    public static int[] arrayDiff(int[] a, int[] b) {
        ArrayList<Integer> collect1 = Arrays.stream(a)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));
        ArrayList<Integer> collect2 = Arrays.stream(b)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));
        collect1.removeAll(collect2);
        return collect1.stream().mapToInt(i -> i).toArray();
    }


    //не работает!
    public static int[] arrayDiff2(int[] a, int[] b) {
        String string = "";
        for (int i : a) {
            string = string.concat(String.valueOf(i));
        }
        for (int i : b) {
            string = string.replace(String.valueOf(i), "");
        }
        return string.chars().map(i -> Character.digit(i, 10)).toArray();
    }

}
