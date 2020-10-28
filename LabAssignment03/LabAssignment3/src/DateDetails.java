
/**
 * Desc Find the duration in days, years, months from the system date to the given date
 * @author Nandhini V
 * Date 24/10/2020
 *
 */
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DateDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Provide the given date
		LocalDate givenDate = LocalDate.of(2021, 5, 10);
		// Get the system date
		LocalDate systemDate = LocalDate.now();
		// Find the duration between two dates
		Period duration = Period.between(givenDate, systemDate);
		System.out.println("The duration between the two date is " + duration.getYears() + "Years "
				+ duration.getMonths() + "months" + duration.getDays() + "Days");

	}

}
