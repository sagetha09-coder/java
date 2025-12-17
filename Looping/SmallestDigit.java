import java.util.Scanner;

public class SmallestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        int min = 9;
        while (num > 0) {
            int digit = (int)(num % 10);
            if (digit < min)
                min = digit;
            num /= 10;
        }
        System.out.println("Smallest digit = " + min);
    }
}
