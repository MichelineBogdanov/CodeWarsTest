/*
You are given a string of letters and an array of numbers.
The numbers indicate positions of letters that must be removed, in order,
starting from the beginning of the array.
After each removal the size of the string decreases (there is no empty space).
Return the only letter left.

Example:
str = "zbk", arr = {0, 1}
str = "bk", arr = {1}
str = "b", arr = {}
return "b"
*/

public class LastSurvivor {

    public static void main(String[] args) {
        System.out.println(lastSurvivor("zbk", new int[]{0, 1}));
        System.out.println(lastSurvivor("abc",  new int[]{1, 1}));
        System.out.println(lastSurvivor("kbc",  new int[]{0, 1}));
    }

    public static String lastSurvivor(String letters, int[] coords) {
        StringBuilder stringBuilder = new StringBuilder(letters);
        for (int coord : coords) {
            stringBuilder.deleteCharAt(coord);
        }
        return stringBuilder.toString();
    }

}
