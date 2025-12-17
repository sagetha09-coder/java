import java.util.Scanner;
public class SwapFirstLastDigit {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int last = temp % 10;
        int first = 0;
        int count = 0;
        while (temp > 0) {
            first = temp % 10;
            temp = temp / 10;
            count++;
        }
        int power = (int) Math.pow(10, count - 1);
        int middle = (num % power) / 10;
        int result = last * power + middle * 10 + first;
        System.out.println("Number after swapping first and last digit: " + result);
    }
}
