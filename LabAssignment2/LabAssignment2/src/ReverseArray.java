
/**
 * Desc Reversing the array and sorting it
 * @author Nandhini V
 * Date 23/10/2020
 *
 */
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the elements of the array");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int resultArray[] = getSorted(arr);
		System.out.println("Enter the elements in the resulting array");
		{
			for (int i = 0; i < resultArray.length; i++) {
				System.out.println(resultArray[i]);
			}
		}

	}

	private static int[] getSorted(int[] arr) {
		// TODO Auto-generated method stub
		int resultArray[] = new int[arr.length];
		// Reverse the numbers in array
		for (int i = 0; i < arr.length; i++) {
			// Convert numbers to string
			String str = Integer.toString(arr[i]);
			StringBuilder sb = new StringBuilder(str);
			String reverse = sb.reverse().toString();
			// Convert the reversed string into integer
			resultArray[i] = Integer.parseInt(reverse);
		}
		// Sort the resulting array in ascending order
		for (int i = 0; i < resultArray.length; i++) {
			for (int j = i + 1; j < resultArray.length; j++) {
				if (resultArray[i] > resultArray[j]) {
					int temp = resultArray[i];
					resultArray[i] = resultArray[j];
					resultArray[j] = temp;
				}
			}
		}
		return resultArray;
	}

}
