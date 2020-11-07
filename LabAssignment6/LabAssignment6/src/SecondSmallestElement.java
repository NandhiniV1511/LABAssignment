
/** 
 * Desc Get the second smallest element from the given array using arrayList
 * @author Nandhini V
 *
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SecondSmallestElement {
	private static int getSecondSmallest(int[] arr) {
		// TODO find the second smallest element
		// create arrayList to sort the elements
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		Collections.sort(list);

		return list.get(1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		// get the size of the array
		int size = sc.nextInt();
		// create the array with given size
		int arr[] = new int[size];
		System.out.println("Enter the elements of the array");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		// call the function getSecondSmallest()
		int result = getSecondSmallest(arr);
		System.out.println(result);
		sc.close();

	}

}
