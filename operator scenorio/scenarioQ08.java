import java.util.Scanner;
public class scenarioQ08{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int nooftray = sc.nextInt();
	    int noofcakeforeachtray = sc.nextInt();
	    int totalcakemade = nooftray*noofcakeforeachtray;
	    
		System.out.println("total Cakesmade :" + totalcakemade);
	}
}
