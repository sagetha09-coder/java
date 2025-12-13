import java.util.Scanner;
    public class formulaQ5{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int x1=sc.nextInt();
            int x2=sc.nextInt();
            int y1=sc.nextInt();
            int y2=sc.nextInt();
            double d=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
            System.out.print("Distance betwwen two points="+d);
        }
    }