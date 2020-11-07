
/**
 * Desc Creating method to return the squares of values in the map
 * Author Nandhini V
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Squares {
	private static Map<Integer, Integer> getSquares(int[] arr) {
		// TODO make squares of the values and put it into the map
		// create hashmap for returning the result
		Map<Integer, Integer> result = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			result.put(arr[i], arr[i] * arr[i]);
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		// get the number of inputs
		int size = sc.nextInt();
		System.out.println("Enter the elemente of array");
		// create array type of integer
		int arr[] = new int[size];
		// get the elements
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		// create the map for store the results from methid
		Map<Integer, Integer> result = new HashMap<>();
		// call the getsquares method
		result = getSquares(arr);
		System.out.println(result);
		sc.close();

	}

}
