import java.util.Scanner;

public class scenarioQ09
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int P = sc.nextInt();
	    int R = sc.nextInt();
	    int Y = sc.nextInt();
	    int simpleinterest = (P*R*Y)/100;
		System.out.println("Simple Interest :" + simpleinterest);
	}
}
