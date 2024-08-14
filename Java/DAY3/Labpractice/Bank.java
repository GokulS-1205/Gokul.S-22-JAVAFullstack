package day3;

class BankAccount
{
	int Balance=100;
	void deposit(int amount) {
		System.out.println("Amount Deposited");
	}
	void withdraw(int amount) {
		System.out.println("Amount Withdrawed");
	}
}
class SavingsAccount extends BankAccount
{
	void withdraw(int amount) {
			if(Balance>100)
		{
			if(amount<Balance)
				System.out.println("Insufficent Balance");
			else
				System.out.println(" Amount"+amount+"Withdrawed");
		}
		else
			System.out.println("Your Balance is less Than Rs.100");
		}
	}
public class Bank {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b = new SavingsAccount();
		b.withdraw(1000);
	}

}