import java.util.Scanner;

public class scenarioQ14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pens = sc.nextInt();
        int price = sc.nextInt();
        int freePens = (pens / 5) * 2;
        int payablePens = pens - freePens;
        int totalAmount = payablePens * price;

        System.out.println("Free pens: " + freePens);
        System.out.println("Pens to pay for: " + payablePens);
        System.out.println("Total amount to pay: Rs. " + totalAmount);
    }
}
