import java.util.Scanner;

public class RemoveZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long result = 0;
        long place = 1; 
        if (num == 0) {
            System.out.println(0);
            return;
        }
        while (num > 0) {
            int digit = (int)(num % 10);
            if (digit != 0) {
                result += digit * place;
                place *= 10;
            }
            num /= 10;
        }

        System.out.println(result);
    }
}
