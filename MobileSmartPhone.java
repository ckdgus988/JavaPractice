package methodDef;

	class MobilePhone{
		protected String number;  //전화번호공유
		
		public MobilePhone(String num) {
			number = num;                
		}
		
		public void answer() {
			System.out.println("Hi~from"+number);
		}
	}
	
	class SmartPhone extends MobilePhone{
		private String androidVer; // 안드로이드 운영체제
		
		public SmartPhone(String num, String ver) {
			super(num);
			androidVer = ver;
		}
		
		public void playApp() {
			System.out.println("APP is running in "+androidVer);
		}
	}

public class MobileSmartPhone {

	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone("010-2222-3333", "Nougat");
		phone.answer(); //전화를 받는다.
		phone.playApp(); //앱을 실행하고 전화를 받는다.
	}

}
