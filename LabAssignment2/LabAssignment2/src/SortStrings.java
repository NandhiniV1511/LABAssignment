
/**
 * Desc Sort the string objects
 * @author Nandhini V
 *Date 23/10/2020
 */
import java.util.Scanner;

public class SortStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		;
		int size = sc.nextInt();
		String arr[] = new String[size];

		System.out.println("Enter the elements of the array");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.next();

		}
		String resultArray[] = sortStrings(arr);
		System.out.println("The sorted string elements are");
		for (int i = 0; i < resultArray.length; i++) {
			System.out.println(resultArray[i]);
		}
	}

	private static String[] sortStrings(String[] arr) {
		// TODO Auto-generated method stub
		// Sort the string objects in ascending order
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].charAt(0) > arr[j].charAt(0)) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		String[] resultArray = new String[arr.length];
		int length = 0;
		if (arr.length % 2 == 0) {
			length = arr.length / 2;
		} else {
			length = arr.length / 2 + 1;
		}
		// Make first half of the array as in Uppercase
		for (int i = 0; i < length; i++) {
			resultArray[i] = arr[i].toUpperCase();
		}
		// Make second half of the array as in lowercase
		for (int i = length; i < arr.length; i++) {
			resultArray[i] = arr[i].toLowerCase();
		}
		return resultArray;
	}

}
