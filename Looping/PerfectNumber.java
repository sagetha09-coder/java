import java.util.Scanner;
    public class PerfectNumber{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int sum=0;
            int temp=n;
            for(int i=1;i<n;i++){
                if(n%i==0){
                    sum+=i;
                }
            }
        if(temp==sum){
            System.out.println("Perfect Number");
        }else{
            System.out.println("Not a perfect Number");
        }
        }
    }