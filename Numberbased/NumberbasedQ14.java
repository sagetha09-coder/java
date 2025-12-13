import java.util.Scanner;
    public class NumberbasedQ14{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            
            if((a%3==0)&&(a%5==0)){
                System.out.println("a is divisible by 3 and 5");
            }else{
                System.out.println("it not divisible by 3 and 5");

            }
        }
    }