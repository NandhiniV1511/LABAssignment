
/**
 * Desc Check the given string is positive string or not
 * @author Nandhini V
 * Date 24/10/2020
 *
 */
import java.util.Scanner;

public class PositiveString {
	private static boolean checkString(String str) {
		// TODO Auto-generated method stub
		for (int i = 0; i < str.length(); i++) {
			// check the previous letter that is prior to that letter
			if (str.charAt(i) > str.charAt(i + 1)) {
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		// Call the function to check the string
		boolean result = checkString(str);
		if (result == true)
			System.out.println("The given string is positive");
		else
			System.out.println("The given string is not positive");
		sc.close();

	}

}
