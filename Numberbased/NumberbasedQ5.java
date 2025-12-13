import java.util.Scanner;
    public class NumberbasedQ5{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            if((a>=100)&&(a<=999)){
                    System.out.println("It is 3 digit number");
            }else{
                    System.out.println("it is not a 3 digit number");
            }
        }
    }