import java.util.Scanner;
    public class Automorphic{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int a=n*n;
            int l=a%10;
            if(l==n){
                System.out.println("Automorphic");
            }else{
                System.out.println("Not a Automorphic");
            }
        }
    }