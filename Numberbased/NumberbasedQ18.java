import java.util.Scanner;
    public class NumberbasedQ18{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            if((a>0)&&(a<=9)){
                    System.out.println("It is single digit number");
            }
            else if((a>=10)&&(a<=99)){
                    System.out.println("It is two digit number");
            }
            else if((a>=100)&&(a<=999)){
                    System.out.println("It is 3 digit number");
            }else{
                    System.out.println("it is more than 3 digit number");
            }
        }
    }