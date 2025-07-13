import java.util.Scanner;


public class Prime {
    public static void main(String[] args) {
        System.out.println("Welke int?");
        Scanner scanner = new Scanner(System.in);
        int lenght = scanner.nextInt();
        int score = 0;
        long start = System.currentTimeMillis();
        for (int i = 1; i <= lenght; i++) {
            for (int x = 1; x <= i; x ++) {
                if (i % x == 0) {
                    ++score;
                    
                }
            }

            if (score == 2) {
                System.out.println(i);

            }
            score = 0;
        }
        long stop = System.currentTimeMillis();
        long time = stop - start;
        System.out.println("In " + time + " milliseconds!");
        scanner.close();

    }
}