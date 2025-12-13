import java.util.Scanner;
    public class NumberbasedQ10{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=a+b;
            if((c&1)==0){
                System.out.println("Even");
            }else{
                System.out.println("odd");
            }
        }
    }