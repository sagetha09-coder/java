import java.util.Scanner;
class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        double bill;
        if(units <= 100) bill = 0;
        else if(units <= 300) bill = (units - 100) * 5;
        else bill = (200 * 5) + (units - 300) * 10;
        if(units > 500) bill += bill * 0.10;
        System.out.println("Bill: " + bill);
    }
}
