package methodDef;

public class BankAcoountPo {
	
	static int balance = 0;
	public static void main(String[] args) {
		deposit(10000);
		checkmyBalance();
		withdraw(3000);
		checkmyBalance();
	}
	private static int deposit(int i) {
		balance += i;
		return balance;
	}

	private static int withdraw(int i) {
		balance -= i;
		return balance;
	}
	private static int checkmyBalance() {
		System.out.println("잔액: "+balance);
		return balance;
	}
	

}
