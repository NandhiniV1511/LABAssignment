


/**
 * Desc Find the difference between the sum of the squares of the first n natural numbers and the square of their sum. 
 * @author Nandhini V
 *Date 22/10/2020
 */
import java.util.Scanner;
public class FindDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number");
int n=sc.nextInt();
int result=calculateDifference(n);
System.out.println("The difference is "+result);

	}

	private static int calculateDifference(int n) {
		// TODO Auto-generated method stub
		int sumofsquares=0;
		
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sumofsquares+=i*i;
			sum+=i;
		}
		return sumofsquares-(sum*sum);
	}

}
