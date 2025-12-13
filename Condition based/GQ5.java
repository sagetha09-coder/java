import java.util.Scanner;

public class GQ5
{
	public static void main(String[] args)
	{
	    Scanner sc= new Scanner(System.in);
	    int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt();
	    if(a==b && b==c && c==d && d==a){
	    System.out.println("Square");
        }
	    else{
	    System.out.println("Rectangle");
        }
	}
}
