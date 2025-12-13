import java.util.Scanner;
public class scenQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bill = sc.nextDouble();
        double discount;
        if(bill >= 5000) discount = bill * 0.20;
        else if(bill >= 2000) discount = bill * 0.10;
        else if(bill >= 1000) discount = bill * 0.05;
        else discount = 0;
        System.out.println("Discount: " + discount);
    }
}
