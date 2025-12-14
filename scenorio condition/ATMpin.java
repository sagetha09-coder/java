import java.util.Scanner;
class ATMpin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int storedPin = 1234;
        int enteredPin = sc.nextInt();
        if(enteredPin == storedPin) System.out.println("PIN Correct, Withdrawal Allowed");
        else System.out.println("Incorrect PIN");
    }
}
