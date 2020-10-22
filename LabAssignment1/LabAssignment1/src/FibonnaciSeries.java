


/**
 * Desc: Find the nth number of fibonnaci series in non recursive function
 * @author NANDHINI V
 *Date: 22/10/2020
 */
import java.util.Scanner;
public class FibonnaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
int result=fibonnaci(n);
System.out.println("The nth value is "+result);

	}

	private static int fibonnaci(int n) {
		// TODO Auto-generated method stub
		int temp1=1,temp2=1;
		int sum=0;
		for(int i=1;i<=n;i++)
		{
		sum=temp1+temp2;

		int t=sum;
		temp1=temp2;
		temp2=sum;

			}
		
		return sum;
	}
}


