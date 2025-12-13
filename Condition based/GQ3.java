import java.util.Scanner;

public class GQ3
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int x=sc.nextInt(),y=sc.nextInt();
	    if(x>0 && y>0)
		System.out.println("I quadrant");
		else if(x<0 && y>0)
		System.out.println(" II quadrant");
		else if(x<0 && y<0)
		System.out.println("III quadrant");
		else
		System.out.println("IV quadrant");
	}
}
