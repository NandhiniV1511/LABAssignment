
/**
 * Desc: reads a line of integers and then displays each integer and the sum of all integers
 * @author Nandhini V\
 * Date 24/10/2020
 *
 */
import java.util.Scanner;
import java.util.StringTokenizer;

public class SumOfIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String integers = sc.next();

		int sum = 0;
		// Using String tokenizer class to displays each integer and sum of all integer
		StringTokenizer st = new StringTokenizer(integers);
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			sum += Integer.parseInt(st.nextToken());
		}
		System.out.println(sum);
		sc.close();

	}
}