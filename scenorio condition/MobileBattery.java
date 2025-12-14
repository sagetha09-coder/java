import java.util.Scanner;
class MobileBattery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int battery = sc.nextInt();
        if(battery == 100) System.out.println(" Full");
        else if(battery >= 50) System.out.println("Moderate");
        else System.out.println("Low ");
    }
}
