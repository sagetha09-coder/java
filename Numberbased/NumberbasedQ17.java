import java.util.Scanner;
    public class NumberbasedQ17{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int n=a%10;
            int b=sc.nextInt();
            int n1=b%10;
            if((n==n1)){
                System.out.println("It as same last digit");
            }else{
                System.out.println("It as different last digit");
            }
        }
    }