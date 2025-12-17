import java.util.Scanner;

public class CountDigitOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digit = sc.nextInt();
        int count = 0;
        int temp = num;
        while (temp > 0) {
            int rem = temp % 10;
            if (rem == digit) {
                count++;
            }
            temp = temp / 10;
        }

        System.out.println("Occurrence of " + digit + " is: " + count);
    }
}
