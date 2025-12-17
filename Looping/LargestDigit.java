import java.util.Scanner;
public class LargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        int max = 0;
        while (num > 0) {
            int digit = (int)(num % 10);
            if (digit > max)
                max = digit;
            num /= 10;
        }
        System.out.println("Largest digit = " + max);
    }
}
