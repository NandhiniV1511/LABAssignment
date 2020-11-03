/** 
 * Desc: Creating class CurrentAccount which is subclass for Account
 * Author Nandhini V
 */
package BankAccount;

public class CurrentAccount extends Account {
	private final float overdraftLimit = 1000;

	public CurrentAccount(double balance, Person accHolder) {
		super(balance, accHolder);

	}

	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		double balAmount = getBalance() - amount + overdraftLimit;
		if (balAmount + overdraftLimit <= 0) {
			System.out.println("The withdrawned amount is " + amount);

		} else {
			setBalance(balAmount);
			System.out.println("Withdrawal is not possible, your overdraft limit is reached!!!");
		}
	}

}
