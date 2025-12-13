import java.util.Scanner;
    public class YQ3{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int year=sc.nextInt();
            int n=year/100,n1=year%100;
            if(n==n1){
                System.out.println("EQUAL");
            }else{
                System.out.println("NOT EQUAL");
            }

        }
    }