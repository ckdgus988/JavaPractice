package methodDef;

	class cake4{
		public void yummy4() {
			System.out.println("Yummy cake");
		}
	}
	class CheeseCake3 extends cake4{
		public void  yummy4() {
			super.yummy4();
			System.out.println("yummy Cheese cake");
		}
		public void tasty4() {
			super.yummy4();
			System.out.println("Yummy Tasty Cake");
		}
	}


public class YummyCakeSuper {

	public static void main(String[] args) {
		CheeseCake3 cake4 = new CheeseCake3 ();
		cake4.yummy4();
		cake4.tasty4();
	}

}
