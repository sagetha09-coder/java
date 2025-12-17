import java.util.Scanner;

public class DigitFrequencyBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long temp = num;

        for (int d = 0; d <= 9; d++) {
            int count = 0;
            temp = num;

            while (temp > 0) {
                int digit = (int)(temp % 10);
                if (digit == d)
                    count++;
                temp /= 10;
            }

            if (count > 0)
                System.out.println("Digit " + d + " : " + count);
        }
    }
}
