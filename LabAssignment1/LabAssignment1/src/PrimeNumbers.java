


/**
 * Desc: Find prime numbers
 * @author Nandhini V
 * Date: 22/10/2020
 *
 */
import java.util.Scanner;
public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		System.out.println("The prime numbers are");
		for(int i=2;i<=number;i++)
		{int flag=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(i+" ");
			}
		}

	}

}
