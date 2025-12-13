import java.util.Scanner;
    public class scenarioQ15{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int m=sc.nextInt();
            int n500=(m/500);
            int n200=(m%500)/200;
            int n100=(m%500)%200/100;
            System.out.println("500:"+n500);
            System.out.println("200:"+n200);
            System.out.println("100:"+n100);


        } 
    }