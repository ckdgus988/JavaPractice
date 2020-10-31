package methodDef;

	class BankAccount2{
		int balance = 0;
		
		public int deposite1(int i) {
			balance += i;
			return balance;
		}
		
		public int withdraw1(int i) {
			balance -= i;
			return balance;
		}
		public void checkMybalance(int i) {
			System.out.println("잔액: "+balance);
			return balance;
		}
		
	}
	

public class PassingRef {

	public static void main(String[] args) {
		
		BankAccount2 ref = new BankAccount2();
		ref.deposite1(3000);
		ref.withdraw1(300);
		
		//ref.checkMybalance();
		//check(ref);  //참조값의전달 
	}
	
	/*public static void check(BankAccount2 acc) {
		acc.checkMybalance(); //acc가 참조하는 인스턴스의 메소드를 호출한다.
		
	}*/

}
