package PrimeandFibonacci;
public class PrimeAndFibonacci {

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int j = 2; j <= Math.sqrt(number); j++) {
            if (number % j == 0) {
                return false;
            }
        }
        return true;
    }
//Prime numbers between 1 and 500
    public static void printPrimes(int start, int stop) {
        System.out.println("Prime numbers between " + start + " and " + stop + ":");
        for (int j = start; j <= stop; j++) {
            if (isPrime(j)) {
                System.out.print(j + " ");
            }
        }
        System.out.println();
    }

    public static int sumEvenFibonacci(int minimum) {
        int sum = 0;
        int x = 1;
        int z = 2;
        while (x <= minimum) {
            if (x % 2 == 0) {
                sum += x;
            }
            int y = x + z;
            x = z;
            z = y;
        }
        return sum;
    }

    public static void main(String[] args) {
        printPrimes(1, 500);
        int sum = sumEvenFibonacci(4000000);
        System.out.println("Sum of all even-valued terms in Fibonacci sequence that do not sub pass four million: " + sum);
    }
}