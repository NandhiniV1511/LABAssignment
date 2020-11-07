
/**
 * Desc To print the number of occurences of character
 * @author Nandhini V
 *
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OccurrencesOfCharacter {
	private static Map<Character, Integer> countChars(char[] cArray) {
		// TODO count the number of occurrences of the character
		// create map to put number of occurrences of character
		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < cArray.length; i++) {
			int count = 0;
			for (int j = 0; j <= i; j++) {
				if (cArray[i] == cArray[j]) {
					count++;
				}
			}
			if (count > 0) {
				map.put(cArray[i], count);
			}

		}
		return map;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		// get the size of the char array
		int size = sc.nextInt();
		// create char array using given size
		char[] cArray1 = new char[size];
		// get the values of char array
		System.out.println("Enter the characters");
		for (int i = 0; i < size; i++) {
			cArray1[i] = sc.next().charAt(0);
		}
		// create map for store the result
		Map<Character, Integer> result = new HashMap<>();
		// call the method countChars
		result = countChars(cArray1);
		System.out.println(result);
		sc.close();

	}

}
