import java.util.Scanner;
    public class countdigit{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int  n=sc.nextInt();
            int count=0;
            if(n==0){
                System.out.print(1);
                return;
            }
            while(n!=0){
                count++;
                n/=10;
            }
        System.out.print(count);
        }
    }