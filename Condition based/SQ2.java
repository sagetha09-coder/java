import java.util.Scanner;
class GradeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        switch(marks/10) {
            case 10:
                System.out.print("destination");
                break;
            case 9: 
               System.out.println("A"); 
               break;
            case 8: 
                System.out.println("B"); 
                break;
            case 7: 
                System.out.println("C"); 
                break;
            case 6: 
                 System.out.println("D"); 
                 break;
            default:
                 System.out.println("Fail");
        }
    }
}
