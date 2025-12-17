import java.util.Scanner;
    public class armstrong{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int temp=n;
            int sum=0;
            int digits=String.valueOf(n).length();
            while(n!=0){
                int digit=n%10;
                sum+=Math.pow(digit,digits);
                n/=10;
            }
            if(temp==sum){
                System.out.print("Armstrong number");
            }else{
                System.out.print("Not an Armstrong number");
            }
            
        }
    }