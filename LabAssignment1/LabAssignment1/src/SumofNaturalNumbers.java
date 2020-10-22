
/**
 * DESC: Find the sum of n natural numbers
 * @author Nandhini V
 * Date 22/10/2020
 *
 */
import java.util.Scanner;
public class SumofNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int result=calculateSum(n);
System.out.println("The sum of n natural numbers is "+result);

	}

	private static int calculateSum(int n) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 && i%5==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}

}
