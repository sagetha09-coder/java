import java.util.Scanner;
class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 10000;
        int choice = sc.nextInt();
        switch(choice) {
            case 1:
                int deposit = sc.nextInt();
                balance += deposit;
                System.out.println( + balance);
                break;
            case 2:
                int withdraw = sc.nextInt();
                switch(withdraw <= balance ? 1 : 0) {
                    case 1:
                        balance -= withdraw;
                        System.out.println( + balance);
                        break;
                    case 0:
                        System.out.println("Insufficient Funds");
                        break;
                }
                break;
            case 3:
                System.out.println("Balance: " + balance);
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}

