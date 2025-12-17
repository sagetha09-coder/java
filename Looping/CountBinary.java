import java.util.Scanner;

public class CountBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int ones = 0, zeros = 0;

        while (num > 0) {
            if (num % 10 == 1)
                ones++;
            else
                zeros++;
            num = num / 10;
        }

        System.out.println("Number of 1s = " + ones);
        System.out.println("Number of 0s = " + zeros);
    }
}
