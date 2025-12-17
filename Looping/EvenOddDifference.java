import java.util.Scanner;

public class EvenOddDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();

        int evenSum = 0;
        int oddSum = 0;

        while (num > 0) {
            int digit = (int)(num % 10);
            if (digit % 2 == 0)
                evenSum += digit;
            else
                oddSum += digit;
            num /= 10;
        }

        int difference = evenSum - oddSum;
        System.out.println("Difference (Even - Odd) = " + difference);
    }
}
