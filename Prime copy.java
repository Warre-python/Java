import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.println("Welke int?");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int primeCount = 0;

        long start = System.currentTimeMillis();

        for (int i = 1; i <= length; i++) {
            if (isPrime(i)) {
                primeCount++;
            }
        }

        long stop = System.currentTimeMillis();
        long time = stop - start;

        System.out.println("Found " + primeCount + " prime numbers.");
        System.out.println("In " + time + " milliseconds!");
        scanner.close();
    }

    public static boolean isPrime(int number) {
        if (number < 2) return false;

        for (int x = 2; x <= Math.sqrt(number); x++) {
            if (number % x == 0) {
                return false;
            }
        }
        return true;
    }
}
