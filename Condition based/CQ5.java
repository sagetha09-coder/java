import java.util.Scanner;
public class CQ5{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            char ch=sc.next().charAt(0);
            char ch1=sc.next().charAt(0);
            if(ch==ch1){
                System.out.println("Equal");
            }else{
                System.out.println("Not equal");
            }
        }
    }