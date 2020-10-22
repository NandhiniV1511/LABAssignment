

/**
 * Desc find the given number is power of two
 * @author Nandhini V
 *Date 20/10/2020
 */
import java.util.Scanner;

public class PowerofTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int number=sc.nextInt();
boolean result=checkNumber(number);
if(result==true)
System.out.println("The given number is power of two");
else
	System.out.println("The given number is not power of two");


	}

	private static boolean checkNumber(int number) {
		// TODO Auto-generated method stub
		while(number>1)
		{
			if(number%2!=0)
			{
				return false;
			}
			number=number/2;
		}
		return true;
	}

}
