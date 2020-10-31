package methodDef;

public class SimpleMeth {

	public static void main(String[] args) {
		System.out.println("원주율:"+Math.PI);
		System.out.println("2의 제곱근:"+Math.sqrt(2)); //sqrt:제곱근
		System.out.println();
		System.out.println("파이에 대한 Degree"+Math.toDegrees(Math.PI));
		System.out.println("2파이에 대한 Degree"+Math.toDegrees(2.0*Math.PI));
		System.out.println();
		
		double radian45 = Math.toRadians(45);
		System.out.println("싸인45:"+Math.sin(45));
		System.out.println("cos45:"+Math.cos(45));
		System.out.println("tan45:"+Math.tan(45));
		System.out.println();
		System.out.println("로그25"+Math.log(25));
		System.out.println("2의 16승 "+Math.pow(2, 16));
		
		
		
	}

}
