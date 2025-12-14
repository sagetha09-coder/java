import java.util.Scanner;
class BatteryCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int battery = sc.nextInt();
        if(battery == 100) System.out.println("Battery Full");
        else if(battery >= 50) System.out.println("50% Consumed");
        else System.out.println("Low Battery");
    }
}
