
/**
 * DESC:To find sum of cubes of an n digit number
 * @author Nandhini V
 *Date: 22/10/2020
 */
import java.util.Scanner;
public class SumofCubes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int number=sc.nextInt();
		int result=CubeSums(number);
		System.out.println("THe sum of cubes of an n digit number is: "+result);

	}

	private static int CubeSums(int number) {
		// TODO Auto-generated method stub
		int res=0;
		while(number!=0)
		{
			int temp=number%10;
			res=res+(temp*temp*temp);
			number=number/10;
		}
		return res;
	}
	

}

