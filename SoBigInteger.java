package methodDef;

import java.math.BigInteger;

public class SoBigInteger {

	public static void main(String[] args) {
		
		System.out.println("최대 정수:"+Long.MAX_VALUE);
		System.out.println("최소 정수:"+Long.MIN_VALUE);
		System.out.println();
		
		BigInteger big1 = new BigInteger("1000000000000000000000000000000000000000000000000000");
		BigInteger big2 = new BigInteger("9000000000000000000000000000000000000000000000000000");
		
		BigInteger r1 = big1.add(big2);
		System.out.println("덧셈 결과:"+r1);
		
		BigInteger r2 = big2.multiply(big2);
		System.out.println("곱셈의 결과:"+r2);
		System.out.println();
		
		int num = r1.intValueExact();
		System.out.println("From BigInteger:"+ num);
		
		
		
		
		
	}

}
