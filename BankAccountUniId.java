package methodDef;


class BankAccount3{
	String accNumber;
	String ssNumber;
	int balance = 0;

	public void initAccount(String acc, String ss, int bal) { // 추가된 메소드 , 인스턴스의 초기화를 위한 메소드.
		accNumber = acc;
		ssNumber = ss;
		balance = bal; 
	}


public int deposite3 (int amount) {
	balance += amount;
	return balance;
	
}

public int withdraw3 (int amount) {
	balance -= amount;
	return balance;
}

public int  checkMyBalance3() {
	System.out.println("계좌번호: "+accNumber);
	System.out.println("주민번호: "+ssNumber);
	System.out.println("총 액수:"+balance+'\n');
	return balance;
}
}

public class BankAccountUniId {

	public static void main(String[] args) {
		BankAccount3 yoon = new BankAccount3();
		yoon.initAccount("12-34-56","9909090-0990000",10000);
		
		BankAccount3 park = new BankAccount3();
		park.initAccount("44-55-66","9909090-0990000",10000);
		
		yoon.deposite3(5000);
		park.deposite3(3000);
		yoon.withdraw3(2000);
		park.withdraw3(2000);
		yoon.checkMyBalance3();
		park.checkMyBalance3();
	}
	
}
