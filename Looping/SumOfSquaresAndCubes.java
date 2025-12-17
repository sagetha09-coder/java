import java.util.Scanner;
public class SumOfSquaresAndCubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        int sumSquares = 0;
        int sumCubes = 0;
        while (num > 0) {
            int digit = (int)(num % 10);
            sumSquares += digit * digit;
            sumCubes += digit * digit * digit;
            num /= 10;
        }
        System.out.println(sumSquares);
        System.out.println(sumCubes);
    }
}
