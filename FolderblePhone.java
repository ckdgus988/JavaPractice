package example2;

public class FolderblePhone extends Phone {

	public FolderblePhone(int serial_No, String owner, String company) {              //셍성자 
		super(serial_No, owner, company);
	}

	
	//추상메소드 재정의 
	@Override
	public void turnOn() {
		System.out.println("폴더블 폰이 켜졌습니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("폴더블 폰이 꺼졌습니다.");
	}
	 
	
	//자체메소드 2	 
		public void foldOn() {
			System.out.println("폴드 기능이 사용됩니다.");
		}
		public void foldoff() {
			System.out.println("폴드 기능이 꺼니다.");
			
	}

}
