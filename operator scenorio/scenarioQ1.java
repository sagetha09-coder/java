import java.util.Scanner;
public class scenarioQ1
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int op = sc.nextInt();
	    int dis = sc.nextInt();
	    int dispercentage = (op*dis)/100;
	    int finalAmount = (op-dispercentage);
	    System.out.println("Original Amount :" + op);
		System.out.println("Final Amount :" + finalAmount);
	}
}
