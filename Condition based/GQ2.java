import java.util.Scanner;

public class GQ2
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
	    if(a*a+b*b==c*c || a*a+c*c==b*b || b*b+c*c==a*a)
		System.out.println("Right angle triangle");
		else
		System.out.println("Not right angle triangle");
	}
}
