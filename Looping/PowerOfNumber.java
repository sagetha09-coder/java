import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // base
        int m = sc.nextInt(); // exponent

        int result = 1;

        for (int i = 1; i <= m; i++) {
            result = result * n;
        }

        System.out.println(result);
    }
}
