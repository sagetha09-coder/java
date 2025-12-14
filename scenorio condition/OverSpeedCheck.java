import java.util.Scanner;

public class OverSpeedCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int speed = sc.nextInt();
        if (speed > 100) {
            System.out.println("Over-speeding! Fine imposed.");
        } else {
            System.out.println("Speed is within limit");
        }
    }
}
