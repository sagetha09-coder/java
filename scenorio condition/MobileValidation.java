import java.util.Scanner;

public class MobileValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mobile = sc.next();
        if (mobile.length() == 10) {
            System.out.println("Valid Number");
        } else {
            System.out.println("Invalid Number");
        }
    }
}
