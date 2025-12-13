import java.util.Scanner;
    public class formulaQ19{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int r=sc.nextInt(); 
            int h=sc.nextInt(); 
            double d=2*Math.PI*r*(r+h);
            double c=2*Math.PI*r*h;
            double v=Math.PI*r*r*h;
            System.out.println("total surface Area of cylinder:"+d);
            System.out.println("curved surface Area of cylinde:"+c);
            System.out.println("volume of cylinde:"+v);
        
        }
    }   

    