import java.util.Scanner;
public class PerfectCubeSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        for (int i = 1; i * i * i <= n; i++) {
            System.out.print((i * i * i) + " ");
        }
    }
}
