	package example2;

public class PhoneEx {

	public static void main(String[] args) {
		
		//Phone phone = new Phone(); //추상클래스는 인스턴스를 생성할 수 없다.
	SmartPhone smartPhone = new SmartPhone(190829, "이창현 ", "삼성 갤럭시 8"); 
	smartPhone.showInfo();
	smartPhone.turnOff();
	smartPhone.turnOn();
	
	

	
	
	}

}
--