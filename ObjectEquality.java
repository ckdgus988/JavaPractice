package methodDef;

class INum{
	
	private int num;

	public  INum(int num) {
		this.num = num;
	}
	
	@Override
	
	public boolean equals(Object obj) {
		if(this.num ==((INum)obj).num)
				return true;
		else
			return false;
		
	}
	
}

public class ObjectEquality {

	public static void main(String[] args) {
	
		INum  num1 = new INum(12);
		INum  num2 = new INum(12);
		INum  num3 = new INum(10);
		
		
		if(num1.equals(num2))
			System.out.println("num1, num2  같다 ");
		else
			System.out.println("num1, num2 다르다 ");
		
		if(num1.equals(num3))
		System.out.println("num1, num3 같다 ");
		else
			System.out.println("num1 num3다르다 ");
	}

}