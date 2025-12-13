import java.util.Scanner;

public class scenairioQ10
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int Basic = sc.nextInt();
	    int HRA = sc.nextInt();
	    int Allowance = sc.nextInt();
	    int Salary = Basic + HRA + Allowance;
		System.out.println("Salary :" + Salary);
	}
}
