
/**
 * Desc to find the eleigible voters
 * @author Nandhini V
 *
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class EligibleVoters {

	private static List<Integer> voterList(Map<Integer, Integer> voters) {
		// TODO find the eligible voters
		// create list to store the eligible voters id
		List<Integer> voterId = new ArrayList<>();
		for (Entry<Integer, Integer> entry : voters.entrySet()) {
			if (entry.getValue() >= 18) {
				voterId.add(entry.getKey());
			}
		}

		return voterId;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// create map for get the people details
		Map<Integer, Integer> voters = new HashMap<>();
		// get the number of people
		System.out.println("Enter the number of people");
		int people = sc.nextInt();
		System.out.println("Enter the people details");
		// put the all the people details in map
		for (int i = 0; i < people; i++) {
			int id = sc.nextInt();
			int age = sc.nextInt();
			voters.put(id, age);
		}
		// create list for get the eligible voters id return from voterList() method
		List<Integer> id = new ArrayList<>();
		// call the method voterList() method
		id = voterList(voters);
		System.out.println(id);

	}

}
