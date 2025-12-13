import java.util.Scanner;

    public class NumberbasedQ19{
        public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=a*b;
            if(c>0){
                System.out.println("c is positive");
            }else if(a<0){
                System.out.println("c is negative");
            }else{
                System.out.println("zero");
            }
        
        }
    }