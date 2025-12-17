import java.util.Scanner;
    public class digitoccure{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int a = sc.nextInt();
            int b= sc.nextInt();
            int count=0;
            while(a>0){
            int rem=a%10;
            if(rem==b){
                count++;
                a=a/10;
            }
            else{
            a=a/10;
            }
        }
        if(count!=0){
            System.out.print("availabe");
        }else{
            System.out.print("not");
        }
    }

    }
    