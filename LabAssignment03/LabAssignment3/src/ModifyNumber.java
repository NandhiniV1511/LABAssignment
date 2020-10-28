import java.util.Scanner;

/**
 * Desc Modify the number as per the requirement
 * 
 * @author Nandhini V Date 24/10/2020
 *
 */
public class ModifyNumber {
	private static int modifyNumber(int number) {
		// TODO Auto-generated method stub
		// Convert the number to string
		String str = Integer.toString(number);
		// Create StringBuffer object
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			// find the difference between two continous digits
			int n1 = Integer.parseInt(String.valueOf(str.charAt(i)));
			int n2 = Integer.parseInt(String.valueOf(str.charAt(i + 1)));
			int diff = n1 - n2;
			sb.append(diff);
		}
		// make the object to string
		String result = sb.toString();
		// convert string to integer
		int resultNumber = Integer.parseInt(result);
		return resultNumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
//Call the function to modify the number
		int result = modifyNumber(number);
		System.out.println("The modified number is " + result);
		sc.close();

	}

}
