import java.util.Scanner;

public class DataUsageAlert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int usage = sc.nextInt();
        if (usage < 50) {
            System.out.println("Low Data");
        }
        else if (usage == 50) {
            System.out.println("Half Consumed");
        }
        else if (usage > 100) {
            System.out.println("Data Over");
        }
        else {
            System.out.println("Data Available");
        }
    }
}
