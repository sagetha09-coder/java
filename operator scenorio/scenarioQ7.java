import java.util.Scanner;

public class scenarioQ7
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int candies = sc.nextInt();
	    int students = sc.nextInt();
	    int Eachget = candies/students;
	    int remaining = candies%Eachget;
		System.out.println("Eachget :" +Eachget);
		System.out.println("Remaining :" +remaining);
	}
}
