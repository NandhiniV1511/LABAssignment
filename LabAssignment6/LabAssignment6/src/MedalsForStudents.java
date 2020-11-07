
/**
 * Desc To get the student details with the medal they are deserving for
 * 
 * @author Nandhini V
 *
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MedalsForStudents {
	private static Map<Integer, String> getStudents(Map<Integer, Integer> student) {
		// TODO offering medals for students based on their marks
		// create map to store the medals details of the students
		Map<Integer, String> medals = new HashMap<>();
		// check the marks of students to assign medals
		for (Map.Entry<Integer, Integer> entry : student.entrySet()) {
			int marks = entry.getValue();
			String medal = "";
			if (marks >= 90) {
				medal = "Gold";
			} else if (marks >= 80 && marks < 90) {
				medal = "Silver";
			} else {
				medal = "Bronze";
			}
			medals.put(entry.getKey(), medal);
		}
		return medals;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students");
		// get the number of students
		int students = sc.nextInt();
		// create the map to put student details
		Map<Integer, Integer> student = new HashMap<>();
		// put the student details into the student map
		for (int i = 0; i < students; i++) {
			int regNo = sc.nextInt();
			int marks = sc.nextInt();
			student.put(regNo, marks);
		}
		// create another map for stire the resut from method getStudents()
		Map<Integer, String> result = new HashMap<>();
		// call the getStudents() method

		result = getStudents(student);
		System.out.println(result);
		sc.close();
	}

}
