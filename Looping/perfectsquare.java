import java.util.Scanner;
    public class perfectsquare{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int s=(int) Math.sqrt(n);
            if(s*s==n){
                System.out.print("perfect square");
            }else{
                System.out.print("not a perfect square");
            }
        }
    }