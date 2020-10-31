package methodDef;

class MobilePhone5{
	protected String number;
	public MobilePhone5(String num) {
		number = num;
	}
	public void answer1() {
		System.out.println("Hi~From"+number);
	}
}

class SmartPhone5 extends MobilePhone5{
	private String androidVer;
	
	public SmartPhone5(String num, String ver) {
		super(num);
		androidVer = ver;
	}
	public void playApp1() {
		System.out.println("App is running in"+androidVer);
	}
	
}

public class MobileSmartPhoneRef {

	public static void main(String[] args) {
		SmartPhone5 ph1 = new SmartPhone5 ("010-555-777","nougha");
		MobilePhone5 ph2 = new SmartPhone5 ("010-2222-3333","Noughat");
		
		ph1.answer1();
		ph1.playApp1();
		System.out.println();
		
		ph2.answer1();
	}

}
