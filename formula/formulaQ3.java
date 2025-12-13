import java.util.Scanner;
    public class formulaQ3{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int b=sc.nextInt();
            double h=sc.nextDouble();
            double tri=0.5*(b*h);
            System.out.print("Area of Triangle:"+tri);
        }
    }