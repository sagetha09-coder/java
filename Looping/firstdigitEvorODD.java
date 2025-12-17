import java.util.Scanner;
    public class  firstdigitEvorODD{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            while(n>=10){
                n=n/10;
            }
            if(n%2==0){
                System.out.print("Even");
            }else{
                System.out.print("Odd");
            }
                
    }
    }