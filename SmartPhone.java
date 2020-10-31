package example2;

public class SmartPhone extends Phone {

	public SmartPhone(int serial_No, String owner, String company) {
		super(serial_No, owner, company);
		
	
	}

	@Override
	public void turnOn() {
		System.out.println("핸드폰이 켜집니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("핸드폰이 꺼집니다.");
	}
	//자체메소드  
	public void internetSerch() {
		System.out.println("네이버가 실행됩니다.");
	}
}
