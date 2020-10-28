
/**
 * Desc Create the mirror image of the string
 * @author Nandhini V
 * Date 24/10/2020
 *
 */
import java.util.Scanner;

public class MirrorImage {
	public static String getImage(String str) {
		// Use StringBuffer class to modify string
		StringBuffer sb = new StringBuffer(str);
		// reverse string using reverse function
		sb.append("|");
		String newString = sb.reverse().toString();

		// append the reversed string with original string
		str += newString;
		return str;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// Get the string
		String str = sc.next();
		// Call function getImage to get the mirror image of given string
		String mirrorImage = getImage(str);
		System.out.println("The mirror image of the string is " + mirrorImage);
		sc.close();
	}

}
