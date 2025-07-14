import java.util.Scanner;


public class Prime {
    public static void calculatePrimeNumbers(String[] args) {
        System.out.println("Welke int?");
        Scanner scanner = new Scanner(System.in);
        int lenght = scanner.nextInt();
        RightToFile.createFile("primes.txt");
        long start = System.currentTimeMillis();
        for (int i = 1; i <= lenght; i++) {
            
            if (isPrime(args, i)) {
                System.out.println(i);
                RightToFile.rightToFile("primes.txt", i + "\n");
            }
        }
        long stop = System.currentTimeMillis();
        long time = stop - start;
        System.out.println("In " + time + " milliseconds!");
        scanner.close();

    }
    public static boolean isPrime(String[] args, int i) {
        int score = 0;
        for (int x = 1; x <= i; x++) {
            if (i == 2) {
                return true;
            }
            if (i % 2 == 0) {
                break;
            }
            if (i % x == 0) {
                score++;
            }

        }
        if (score == 2) {
            return true;
        } else {
            return false;
        }
        
    }
}