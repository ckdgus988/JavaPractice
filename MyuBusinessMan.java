package methodDef;

class man {
	String name;
	public void tellYourName() {
		System.out.println(" MY Name is: "+name);
	}
}

class BusinessMan extends man{
	String company;
	String position;
	

public BusinessMan(String name, String company, String position) {
	this.name=name;
	this.company=company;
	this.position=position;
}

	public void tellYourInfo() {
		System.out.println("My company is "+ company);
		System.out.println("My position is "+ position);
		tellYourName();
	}
	}


public class MyuBusinessMan {

	public static void main(String[] args) {
		
		BusinessMan man = new BusinessMan("Yoon","Hybrid ElD","StaffEng.");
		man.tellYourInfo();
	}

}
