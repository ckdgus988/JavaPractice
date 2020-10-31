package methodDef;

	class UnivFriend{
		private String name;
		private String major;
		private String phone;
		
		public UnivFriend(String na, String ma, String ph) {
			name = na;
			major = ma;
			phone = ph;
		}
		public void showInfo() {
		System.out.println("이름: "+ name);
		System.out.println("전공: "+ major);
		System.out.println("번호: "+ phone);
	}
	}
	
	class CompFriend{
		private String name;
		private String department;
		private String phone;
		
		public CompFriend(String na, String de, String ph) {
			name = na;
			department = de;
			phone = ph;
		}
		public void showInfo() {
			System.out.println("이름: " + name);
			System.out.println("부서: " + department);
			System.out.println("전화: " + phone);
		}
	}


public class MyFreinds {

	public static void main(String[] args) {
		UnivFriend[] ufrns = new UnivFriend[5];
		int ucnt = 0;
		CompFriend[] cfrns = new CompFriend[5];
		int ccnt = 0;
		
		ufrns[ucnt++] = new UnivFriend("LEE","Computer","010-2323-9999");
		ufrns[ucnt++] = new UnivFriend("SEO","Electrionics","010-5555-6666");
		
		cfrns[ccnt++] = new CompFriend("Yoon","R&D","010-2222-7777");
		cfrns[ccnt++] = new CompFriend("PARK","R&D","010-7777-7777");
		
		for(int i = 0; i<ucnt; i++) {
			ufrns[i].showInfo();
			System.out.println();
			
		}
		
		for(int  i= 0; i<ccnt; i++) {
			cfrns[i].showInfo();
			System.out.println();
		}
	}
}
