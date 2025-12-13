import java.util.Scanner;
    public class avgnum{
        public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=a+b+c;
            System.out.println("average of 3 numbers"+ " = " + d/3);

        }
    }