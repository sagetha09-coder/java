import java.util.Scanner;

public class scenairioQ13 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int buy = sc.nextInt();
        int free = buy/3;
        int totalmango = buy+free;
        int amountpay = buy*price;
        System.out.println("Mango :" + totalmango);
        System.out.println("Amounttopay :" +amountpay); 
    }
}