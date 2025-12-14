import java.util.Scanner;

public class ticketprice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age < 12) {
            System.out.println("Category: Child");
            System.out.println("Ticket Price: Rs.100");
        }
        else if (age >= 12 && age < 60) {
            System.out.println("Category: Adult");
            System.out.println("Ticket Price: Rs.200");
        }
        else {
            System.out.println("Category: Senior Citizen");
            System.out.println("Ticket Price: Rs.150");
        }
    }
}
