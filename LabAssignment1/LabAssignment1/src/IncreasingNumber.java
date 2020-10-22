

/**
 * Desc Find the number is an increasing number or not
 * @author Nandhini V
 *Date 22/10/2020
 */
import java.util.Scanner;

public class IncreasingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int number=sc.nextInt();
boolean result=checkNumber(number);
if(result==true)
System.out.println("The given number is increasing number");
else
	System.out.println("The given number is not a increasing number");

	}

	private static boolean checkNumber(int number) {
		// TODO Auto-generated method stub
		int digit=number%10;
		number=number/10;
		int flag=0;
		while(number!=0)
		{
			
			if(digit<=number%10)
			{
				flag=1;
				break;
			}
			digit=number%10;
			number=number/10;
			
		}
		if(flag==1)
		return false;
		else 
			return true;
	}

}
