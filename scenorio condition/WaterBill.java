import java.util.Scanner;

public class WaterBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int liters = sc.nextInt();
        double bill = 0;
        if (liters <= 1000) {
            bill = 0;
        } 
        else if (liters <= 3000) {
            bill = (liters - 1000) * 5.0 / 1000;
        } 
        else {
            bill = (2000 * 5.0 / 1000) 
                 + (liters - 3000) * 10.0 / 1000;
        }

        System.out.println("Water Bill Amount = ₹" + bill);
    }
}
