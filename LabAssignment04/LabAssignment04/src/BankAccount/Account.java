/**
 * Desc: Creating the class Account
 * Author Nandhini V
 */
package BankAccount;

public class Account {
	private long accountNumber;
	private double balance;
	private Person accountHolder;

	public Account(double balance, Person accountHolder) {
		this.balance = balance;
		this.accountHolder = accountHolder;
	}

	public long getAccountNum() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Person getAccHolder() {
		return accountHolder;
	}

	public void setAccHolder(Person accountHolder) {
		this.accountHolder = accountHolder;
	}

	public void deposit(double amount) {
		amount = balance + amount;
		setBalance(amount);
	}

	public void withdraw(double amount) {
		amount = balance - amount;
		setBalance(amount);

	}

}
