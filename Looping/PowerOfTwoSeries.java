import java.util.Scanner;

public class PowerOfTwoSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        for (int i = 1; i <= n; i *= 2) {   
            System.out.print(i + " ");
        }
    }
}
