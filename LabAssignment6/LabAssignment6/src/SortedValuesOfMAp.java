
/**
 * Desc Get the values of map and sorted return the sorted values as list
 * @author Nandhini V
 *
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SortedValuesOfMAp {

	private static List<Integer> getValues(Map<Integer, Integer> map) {
		// TODO sort the values of the map
		// create the list to store the values of map
		List<Integer> list = new ArrayList<>();
		// get the values of map by using key
		for (int i = 1; i <= map.size(); i++) {
			list.add(map.get(i));
		}
		// sort the list values
		Collections.sort(list);
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		// get the sixe of the elements
		int size = sc.nextInt();
		// create map
		Map<Integer, Integer> map = new HashMap<>();
		// put the values in the map
		for (int i = 1; i <= size; i++) {
			map.put(i, sc.nextInt());
		}
		// create a list which is used to store the result from the method getValues
		List<Integer> result = new ArrayList<>();
		// call the method getValues
		result = getValues(map);
		System.out.println(result);

	}

}
