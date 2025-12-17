import java.util.Scanner;

public class DescendingDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int prev = -1;   
        boolean descending = true;
        while (num > 0) {
            int curr = num % 10;   
            if (curr < prev) {
                descending = false;
                break;
            }
            prev = curr;
            num = num / 10;
        }
        if (descending)
            System.out.println("Digits are in descending order");
        else
            System.out.println("Digits are NOT in descending order");
    }
}
