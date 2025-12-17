import java.util.Scanner;
    public class Powofthree{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            if(n<=0){
                System.out.println("it is not a pow 3");
            }else{
                while(n%3==0){
                    n=n/3;
                }
            }
        if(n==1){
            System.out.println("It is pow of 3");
        }else{
            System.out.println("It id not pow of 3");
        }
        }
    }