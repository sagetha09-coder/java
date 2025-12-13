import java.util.Scanner;
    public class NumberbasedQ8{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int a=n%10;
            if(a%3==0){
                System.out.println("The lastdigit is divisible by 3");
            }else{
                System.out.println("The lastdigit is not divisible by 3");

            }
        }
    }