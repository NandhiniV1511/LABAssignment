import java.util.Scanner;

class DetailsOfCar {
	public String userName;
	public String registerNumber;

	public DetailsOfCar(String userName, String registerNumber) {
		this.userName = userName;
		this.registerNumber = registerNumber;
	}

}

public class CarParking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// Declaration of jagged array of Car details
		DetailsOfCar story[][] = new DetailsOfCar[5][];
		// Instatntiation of array
		story[0] = new DetailsOfCar[100];
		story[1] = new DetailsOfCar[70];
		story[2] = new DetailsOfCar[50];
		story[3] = new DetailsOfCar[20];
		story[4] = new DetailsOfCar[10];
		// Display the choice
		System.out.println("1.Park Car");
		System.out.println("2.Get Car");
		System.out.println("3.Get available space");
		System.out.println("4.Enter your choice");
		System.out.println("Enter the choice");

		int choice = sc.nextInt();
		// Using switch case to get the details for the given choice
		switch (choice) {
		// Checking the parking area to park the new user car
		case 1:
			System.out.println("Ethe the User name");
			String userName = sc.next();
			System.out.println("Enter the Register number");
			String registerNumber = sc.next();
			DetailsOfCar dc = new DetailsOfCar(userName, registerNumber);
			loop: for (int i = 0; i < 5; i++) {
				for (int j = 0; j < story[i].length; j++) {
					// check whether the lot is parked or not
					if (story[i][j] == null) {
						story[i][j] = dc;
						System.out.println("Your car can be parked in number " + j + "in story " + i);
						break loop;
					} else {
						System.out.println("Sorry! You can't park the car");

					}
				}
			}
			// By using register number get the parking lot of the car
		case 2:
			System.out.println("Enter your register number");
			String regNo = sc.next();
			int floor = 0, place = 0;
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < story[i].length; j++) {
					if (story[i][j] != null) {
						DetailsOfCar dc1 = story[i][j];
						String temp = dc1.registerNumber;
						if (regNo.equalsIgnoreCase(temp)) {
							floor = i + 1;
							place = j + 1;
							story[i][j] = null;
						}

					}
				}
			}
			if (floor == 0 && place == 0) {
				System.out.println("The car is not found");
			} else {
				System.out.println("Your car is parked in number " + place + " in " + floor + "story");
			}
			break;
		// Checking the available lots to park the car
		case 3:

			loop: for (int i = 0; i < 5; i++) {
				for (int j = 0; j < story[i].length; j++) {
					if (story[i][j] == null) {
						System.out.println("there is place to park");
						break loop;
					} else {
						System.out.println("Parking area is full");
					}

				}
			}
			break;
		default:
			System.out.println("Give the choice you want to kow");
		}

	}

}
