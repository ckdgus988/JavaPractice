package methodDef;

	class BankAccount{
		int balance = 0;

		
		public int desposite(int i) {
			balance += i;
			return balance;
		}

		public int withdraw(int i) {
			balance -= i;
			return balance;
		}

		public int checkMyBalance() {
			System.out.println("현재잔액: "+balance);
			return balance;
		}
		
		
	}
	



public class BankAccount00 {

	public static void main(String[] args) {
		
		BankAccount yoon = new BankAccount();
		BankAccount park = new BankAccount();
		
		yoon.desposite(5000);  //참조변수 yoon을 통해 deposite메소드 호출.
		park.desposite(3000);
		
		yoon.withdraw(2000);
		park.withdraw(2000);
		
		yoon.checkMyBalance();
		park.checkMyBalance();
	}

}
