import java.util.Scanner;

public class MagicNumberSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) { 
            int num = i;
            while (num > 9) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                num = sum;
            }

            if (num == 1) {
                System.out.print(i + " ");
            }
        }
    }
}
