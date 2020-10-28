
/**
 * Desc Display number of characters, lines, words i given text
 * @author Nandhini V
 * Date 24/10/2020
 *
 */
import java.util.Scanner;

public class Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int characters = str.length();// Count number of characters
		String words[] = str.split(" ");// Count number of words
		String lines[] = str.split("\n");// count number of lines
		System.out.println("Number of characters:" + characters);
		System.out.println("Number of words:" + words.length);
		System.out.println("Number of lines:" + lines.length);
		sc.close();
	}

}
