import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int binary = 0, place = 1;

        while (num > 0) {
            binary = binary + (num % 2) * place;
            num = num / 2;
            place = place * 10;
        }

        System.out.println("Binary = " + binary);
    }
}
