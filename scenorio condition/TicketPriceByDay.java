import java.util.Scanner;

public class TicketPriceByDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        if (day >= 1 && day <= 5) {
            System.out.println("Weekday");
            System.out.println("Ticket Price: Rs.150");
        }
        else if (day == 6 || day == 7) {
            System.out.println("Weekend");
            System.out.println("Ticket Price: Rs.200");
        }
        else {
            System.out.println("Invalid day number");
        }
    }
}
