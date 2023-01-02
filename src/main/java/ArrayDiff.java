
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
        System.out.println(Arrays.toString(arrayDiff(new int[] {13, 22, 342, 2, 3}, new int[] {2})));
        System.out.println("--------------------");
        System.out.println(Arrays.toString(arrayDiff2(new int[]{1, 2}, new int[]{1})));
        System.out.println(Arrays.toString(arrayDiff2(new int[]{1, 2, 2}, new int[]{1})));
        System.out.println(Arrays.toString(arrayDiff2(new int[]{1, 2, 2}, new int[]{2})));
        System.out.println(Arrays.toString(arrayDiff2(new int[] {1, 2, 2, 2, 3}, new int[] {2})));
        System.out.println(Arrays.toString(arrayDiff2(new int[] {13, 22, 342, 2, 3}, new int[] {2})));
    }

    public static int[] arrayDiff(int[] a, int[] b) {
        ArrayList<Integer> init = Arrays.stream(a)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));
        ArrayList<Integer> check = Arrays.stream(b)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));
        init.removeAll(check);
        return init.stream().mapToInt(i -> i).toArray();
    }


    //не работает!
    public static int[] arrayDiff2(int[] a, int[] b) {
        //String init = Arrays.toString(a).replace("[", "").replace("]", " ").replaceAll(", ", " ");
        String init = Arrays.stream(a)
                .mapToObj(i -> i + " ")
                .collect(Collectors.joining());
        System.out.println(init);
        ArrayList<String> collect = Arrays.stream(b)
                .mapToObj(String::valueOf)
                .collect(Collectors.toCollection(ArrayList::new));
        for (String s : collect) {
            init = init.replaceAll("%s ".formatted(s), "");
        }
        return Arrays.stream(init.split(" ")).mapToInt(Integer::parseInt).toArray();
    }

}
