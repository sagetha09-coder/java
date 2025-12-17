import java.util.Scanner;
public class AscendingDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int prev = 10;   // greater than any digit
        boolean ascending = true;
        while (num > 0) {
            int curr = num % 10;   // extract last digit
            if (curr > prev) {
                ascending = false;
                break;
            }
            prev = curr;
            num = num / 10;
        }
        if (ascending)
            System.out.println("Digits are in ascending order");
        else
            System.out.println("Digits are NOT in ascending order");
    }
}
