import java.util.Scanner;

public class UpperToLowerASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }

        System.out.println("Lowercase = " + ch);
    }
}
