
/**
 * Desc Removing duplicates from the array and sorted it in descending order
 * @author Nandhini V
 *Date 23/10/2020
 */
import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {

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
		int resultArray[] = modifyArray(arr);

		System.out.println("Enter the elements in the resulting array");
		{
			for (int i = 0; i < resultArray.length; i++) {
				System.out.println(resultArray[i]);
			}
		}

	}

	private static int[] modifyArray(int[] arr) {
		// TODO Auto-generated method stub
		int length = arr.length;
		int temp[] = new int[length];
		int k = 0, count = 0;
		Arrays.sort(arr);
		// Removing duplicate elements
		for (int i = 0; i < length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[k++] = arr[i];

			} else {
				count++;
			}
		}
		temp[k++] = arr[length - 1];
		int resultArray[] = new int[length - count];
		int len = 0;
		for (int i = 0; i < length; i++) {
			if (temp[i] <= 0) {
				continue;
			} else {
				resultArray[len++] = temp[i];
			}
		}
		// Sort the resulting array in decending order
		for (int i = 0; i < resultArray.length; i++) {
			for (int j = i + 1; j < resultArray.length; j++) {

				if (resultArray[i] < resultArray[j]) {
					int t = resultArray[i];
					resultArray[i] = resultArray[j];
					resultArray[j] = t;

				}
			}
		}

		return resultArray;
	}

}
