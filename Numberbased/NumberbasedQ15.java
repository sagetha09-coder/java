import java.util.Scanner;
    public class NumberbasedQ15{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            
            if(a%3==0){
                System.out.println("a is divisible by 3 ");
            }else if(a%7==0){
                System.out.println("a divisible by 7");
            }else{
                System.out.println("a is not divisible by both");
            }
        }
    }