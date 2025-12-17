import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();

        boolean hasEven = false;
        boolean hasOdd = false;

        if (num == 0) hasEven = true;

        while (num > 0) {
            int digit = (int)(num % 10);
            if (digit % 2 == 0)
                hasEven = true;
            else
                hasOdd = true;

            num /= 10;
        }

        if (hasEven && hasOdd)
            System.out.println("Mixed");
        else if (hasEven)
            System.out.println("All Even");
        else
            System.out.println("All Odd");
    }
}
