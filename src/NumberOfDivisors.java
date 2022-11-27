public class NumberOfDivisors {
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
