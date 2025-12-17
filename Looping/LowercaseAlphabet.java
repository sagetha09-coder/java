import java.util.Scanner;
public class LowercaseAlphabet{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=n;i<=122;i++){
        System.out.print((char)i+" ");
    }
    }
}