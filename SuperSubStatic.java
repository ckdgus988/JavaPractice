package methodDef;

class SuperCLS4{
	protected static int count = 0;  
	
	public SuperCLS4() {
		count++;
	}
}
	class SubCLS4 extends SuperCLS4{
		
		public void showCount() {
			System.out.println(count);
		}
	}

public class SuperSubStatic {

	public static void main(String[] args) {
		
		SuperCLS4 obj1 = new SuperCLS4();  //1
		SuperCLS4 obj2 = new SuperCLS4(); //1
		
		SubCLS4 obj3 = new SubCLS4();
		obj3.showCount();
	}

}
