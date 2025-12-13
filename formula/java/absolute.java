import java.util.Scanner;

public class absolute
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int absoluteValue = Math.abs(n);
        System.out.println(absoluteValue);
    }
}