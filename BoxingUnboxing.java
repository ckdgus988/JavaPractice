package methodDef;

public class BoxingUnboxing {

	public static void main(String[] args) {
		Integer iObj = new Integer(10);
		Double dObj = new Double(2.4);
		System.out.println(iObj);
		System.out.println(dObj);
		System.out.println();
		
		
		int num1 = iObj.intValue();
		double num2 = dObj.doubleValue();
		System.out.println(num1);
		System.out.println(num2);
		System.out.println();
		
		iObj = new Integer(iObj.intValue()+10);
		dObj = new Double(dObj.doubleValue()+10);
		
		System.out.println(iObj);
		System.out.println(dObj);
		
		
		
		
	}

}
