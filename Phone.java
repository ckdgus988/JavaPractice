package example2;

public abstract class Phone {

	private int serial_No;
	private String owner;
	private String company;
	
	public Phone(int serial_No, String owner, String company) {
		super();
		this.serial_No = serial_No;
		this.owner = owner;
		this.company = company;
		
	}

	public int getSerial_No() {
		return serial_No;
	}

	public String getOwner() {
		return owner;
	}

	public String getCompany() {
		return company;
	}

	public abstract void turnOn();  // 추상메소드 선언. 
	public abstract void turnOff();
	
	public void showInfo() {
		System.out.println("시리얼 넘버:" +this.getSerial_No());
		System.out.println("제조회:" +this.getCompany());
		System.out.println("소유자 :" +this.getOwner());
	}
		public void internetSerch() {
		System.out.println("네이버를 실행합니");
	}
}
