

/**
 * Desc: Traffic light
 * @author Nandhini V
 *Date: 22/10/2020
 */
import java.util.Scanner;

public class TrafficLight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
//		System.out.println("1.Red");
//		System.out.println("2.Yellow");
//		System.out.println("3.Green");
		String choice=sc.next();
		String message=FindtheChoice(choice);
		System.out.println("The appropriate message for the choice is "+message);

	}

	private static String FindtheChoice(String choice) {
		// TODO Auto-generated method stub
		if(choice.equalsIgnoreCase("RED"))
		{
			return "STOP";
		}
		else if(choice.equalsIgnoreCase("YELLOW"))
		{
			return "READY";
		}
		else if(choice.equalsIgnoreCase("GREEN"))
		{
			return "GO";
			}
		return null;
	}

}
