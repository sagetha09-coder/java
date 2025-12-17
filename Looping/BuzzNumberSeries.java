import java.util.Scanner;
public class BuzzNumberSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        System.out.println("Buzz numbers from 1 to " + n + " are:");
        for (int i = 1; i <= n; i++) {    
            if (i % 7 == 0 || i % 10 == 7) {
                System.out.print(i + " ");
            }
        }
    }
}
