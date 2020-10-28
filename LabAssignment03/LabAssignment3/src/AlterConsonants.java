
/**
 * Desc Replace all the consonants with next alphabet
 * @author Nandhini V
 * Date 24/10/2020
 *
 */
import java.util.Scanner;

public class AlterConsonants {
	private static String alterString(String str) {
		// TODO Auto-generated method stub
		String newString = "";
		for (int i = 0; i < str.length(); i++) {
			// Check the characters are vowels or not
			if (str.charAt(i) == 'a' || str.charAt(i) == 'A' || str.charAt(i) == 'e' || str.charAt(i) == 'E'
					|| str.charAt(i) == 'i' || str.charAt(i) == 'I' || str.charAt(i) == 'o' || str.charAt(i) == 'O'
					|| str.charAt(i) == 'u' || str.charAt(i) == 'U') {
				newString += str.charAt(i);
			}
			// if consonants founded then make them to next character
			else {

				newString += (char) (str.charAt(i) + 1);
			}
		}
		return newString;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//Get the String
		String str = sc.next();
//Call the AlterString to alter the consonants
		String result = alterString(str);
		System.out.println("The altered string is " + result);
		sc.close();

	}

}
