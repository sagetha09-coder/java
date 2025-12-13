import java.util.Scanner;
    public class NumberbasedQ20{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            char ch=sc.next().charAt(0);
            if(((int)ch)%2==0){
                System.out.print("Even");
            }else{
                System.out.print("Odd");
            }

        }
    }