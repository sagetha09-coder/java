import java.util.Scanner;
    public class NumberbasedQ12{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int n=a%10;
            if((n&1)==0){
                System.out.println("Even");
            }else{
                System.out.println("odd");
            }
        }
    }