/**
 * Desc To match the salutation with names
 * 
 * @author Nandhini V Date 23/10/2020
 *
 */
public class SalutationMAtching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] names = { { "Mr", "Mrs", "Ms" }, { "Prateek", "Surya", "Aishwarya", "Rohan", "Leena" } };
		System.out.println(names[0][0] + ". " + names[1][0]);
		System.out.println(names[0][0] + ". " + names[1][1]);
		System.out.println(names[0][2] + ". " + names[1][2]);
		System.out.println(names[0][0] + ". " + names[1][3]);
		System.out.println(names[0][2] + ". " + names[1][4]);

	}

}
