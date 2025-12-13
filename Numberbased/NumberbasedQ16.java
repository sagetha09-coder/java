import java.util.Scanner;
    public class NumberbasedQ16{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            if((a%2==0)&&(a%5==0)&&(a%8!=0)){
                System.out.println("a is divisible by 3 and 5 and not by 8 ");
            }
             else {
                System.out.println("a is divisible not by 3 and 5 and not by 8");
            }
        }
    }
    