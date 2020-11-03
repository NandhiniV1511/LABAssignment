/**
 * Desc: Creating Main class called AccountTest
 * Author Nandhini V
 */

package BankAccount;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Person personSmithObj = new Person("smith", 22);
		Account accSmithObj = new Account(2000.0, personSmithObj);

		Person personKathyObj = new Person("kathy", 24);
		Account accKathyObj = new Account(3000.0, personKathyObj);

		accSmithObj.deposit(2000);
		accKathyObj.withdraw(2000);

		System.out.println("The current balance of smith's bank account is " + accSmithObj.getBalance());
		System.out.println("The current balance of kathy's bank account is " + accKathyObj.getBalance());

		SavingsAccount savObj = new SavingsAccount(2000, personSmithObj);
		savObj.withdraw(2000);

		CurrentAccount currObj = new CurrentAccount(3000, personKathyObj);
		currObj.withdraw(5000);

		System.out.println("The current balance of smith's bank account is " + savObj.getBalance());
		System.out.println("The current balance of kathy's bank account is " + currObj.getBalance());

	}

}
