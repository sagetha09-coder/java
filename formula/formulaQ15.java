import java.util.Scanner;
    public class formulaQ15{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int l=sc.nextInt();
            int b=sc.nextInt();
            int h=sc.nextInt();
            
            System.out.print("surface Area of cuboid:"+2*(l*b)+(b*h)+(h*l));
        }
    }