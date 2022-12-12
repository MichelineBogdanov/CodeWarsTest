
/*
Count the number of divisors of a positive integer n.
Random tests go up to n = 500000.
Note you should only return a number, the count of divisors.
The numbers between parentheses are shown only for you to see which numbers are counted in each case.
*/

public class NumberOfDivisors {

    public static void main(String[] args) {

    }

    public long numberOfDivisors(int n) {
        // TODO please write your code below this comment
        long numberOfDivisors = 0;
        for (int i = 0; i < n / 2; i++) {
            if (n % i == 0) {
                numberOfDivisors++;
            }
        }
        return numberOfDivisors;
    }
}
