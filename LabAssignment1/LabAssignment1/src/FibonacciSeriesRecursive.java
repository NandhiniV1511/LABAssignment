

/**
 * Desc fibonnaci series using recursive function
 * @author Nandhini V
 *Date 22/10/2020
 */
import java.util.Scanner;
public class FibonacciSeriesRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int result=fibonnaci(number);
		System.out.println("The nth value is "+result);
		

	}

	private static int fibonnaci(int number) {
		// TODO Auto-generated method stub
		if(number<=1)
		{
			return number;
		}
		return fibonnaci(number-1)+fibonnaci(number-2);
	}

}
