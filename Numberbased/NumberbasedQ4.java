    import java.util.Scanner;
    public class NumberbasedQ4{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            int n=a-b;
            if(n%2==0){
                System.out.println("Even");
            }else{
                System.out.println("Odd");
            }
        }
    }