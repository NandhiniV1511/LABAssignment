
/**
 * Desc Fining the second smallest element in the array
 * @author Nandhini V
 * Date 23/10/2020
 *
 */
import java.util.Scanner;

public class SecondSmallestElement {

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
		int secondSmallestElement = getSecondSmallest(arr);
		System.out.println("The second smallest element is " + secondSmallestElement);

	}

	private static int getSecondSmallest(int[] arr) {
		// TODO Auto-generated method stub
		// Sort the array in ascending order
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
		// return the second smallest element in the array
		return arr[1];
	}

}
