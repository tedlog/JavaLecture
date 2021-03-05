class MyAccount
{
	int balance;
	String bank;

	void view()
	{
		System.out.println(balance);
	}

	void deposit(int money)
	{
		balance = balance + money;
		System.out.println("balance = " + balance);
	}

	int withdraw(int money)
	{
		balance = balance - money;
		return money;
	}

}

public class MyWealth
{

	public static void main(String[] args)
	{
		MyAccount account = new MyAccount();
		account.bank = "KB국민은행";
		System.out.println(account.bank);
		account.deposit(100);
		int money = account.withdraw(50);
		account.view();

	}

}
