import java.util.Scanner;
public class buzzNumeber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l=n%10;
        if(l==7 ||n%7==0){
            System.out.println("Its a Buzz Number");
        }else{
            System.out.println("Not a Buzz Number");
        }
    }
}