
/** 
 * Desc Sort the array elements by reversing the lements in the array
 * @author Nandhini V
 *
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortArrayElements {

	// TODO Auto-generated method stub
	private static int[] getSorted(int[] arr) {
		// TODO sort the values of array after reversing the numbers
		// create a list to store the values of reversed numbers
		List<Integer> sort = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			// convert number to string using StringBuffer
			String str = Integer.toString(arr[i]);
			StringBuffer sb = new StringBuffer(str);
			String result = sb.reverse().toString();
			// convert reverse string to number
			int number = Integer.parseInt(result);
			// add the number into list
			sort.add(number);

		}
		// sort the list using collectio API
		Collections.sort(sort);
		int resultArray[] = new int[arr.length];
		int k = 0;
		// put the sorted elements into the result array
		for (Integer i : sort) {
			resultArray[k++] = i;
		}
		return resultArray;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		// get the size of the array
		int size = sc.nextInt();
		// create the array with given size
		int arr[] = new int[size];
		System.out.println("Enter the values of the array");
		// get the values of the array
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		// call the function getSorted
		int result[] = getSorted(arr);
		// print the values of resulting array
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		sc.close();

	}

}
