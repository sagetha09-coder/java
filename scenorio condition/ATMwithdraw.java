import java.util.Scanner;
class ATMwithdraw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 10000;
        int withdraw = sc.nextInt();
        if(withdraw <= balance && withdraw % 100 == 0) {
            balance -= withdraw;
            System.out.println("Withdrawal Successful, Balance: " + balance);
        } else System.out.println("Invalid Withdrawal");
    }
}
