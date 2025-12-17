import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int a = 0, b = 1;
        n = sc.nextInt();
        System.out.println("Fibonacci series up to " + n + " terms:");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
