import java.util.Scanner;
    public class octtoint{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
                String oct =sc.nextLine();
                int a=Integer.parseInt(oct,8);
            System.out.print(a);
            
        }
    }