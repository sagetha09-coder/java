import java.util.Scanner;

public class YQ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        int days = 0;

        if (year <= 0) {
            System.out.println("Invalid year");
        } else {
            switch (month) {
                case 1: case 3: case 5: case 7:
                case 8: case 10: case 12:
                    days = 31;
                    break;

                case 4: case 6: case 9: case 11:
                    days = 30;
                    break;

                case 2:
                    switch ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? 1 : 0) {
                        case 1:
                            days = 29;
                            break;
                        case 0:
                            days = 28;
                            break;
                    }
                    break;

                default:
                    System.out.println("Invalid month");
                    return;
            }

            System.out.println("Number of days = " + days);
        }
    }
}
