import java.util.Scanner;
    public class GQ1{
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
        if(a==b && b==c && c==a){
            System.out.println("Equilatrel triangle");
        }else if(a==b || b==c || c==a){
            System.out.println("Isoscels triangle");
        }
        else{
            System.out.println("Scalene triangle");
        }
        }
    }    
    