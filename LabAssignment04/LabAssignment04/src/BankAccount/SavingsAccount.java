/**
 * Desc: Creating SavingAccounts class which extends the Account class
 * Author Nandhini V
 * 
 */
package BankAccount;

public class SavingsAccount extends Account {
	private final float minimumBalance = 500;

	public SavingsAccount(double balance, Person accHolder) {
		super(balance, accHolder);
	}

	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		double balAmount = getBalance() - amount;
		if (balAmount <= minimumBalance) {
			System.out.println("The withdrawned amount is " + amount);
		} else {
			setBalance(balAmount);
			System.out.println("Withdrawal is not possible, you have reached the minimum balance!!!");
		}
	}

}
