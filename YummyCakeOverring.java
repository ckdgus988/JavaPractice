package methodDef;
class Cake{
	public void yummy() {
		System.out.println("Yummy cake");
	}
}

class CheeseCake extends Cake{
	public void yummy() {
		System.out.println("Yummy Cheese Cake");
	}
}

public class YummyCakeOverring {

	public static void main(String[] args) {

	Cake c1 = new CheeseCake();
	CheeseCake c2 = new CheeseCake();
	
	c1.yummy();
	c2.yummy();          //가장 마지막에 오버라이딩한 yummy 메소드 호
	}

}
