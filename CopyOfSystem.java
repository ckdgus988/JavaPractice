package methodDef;

public class CopyOfSystem {

	public static void main(String[] args) {
		double[] org = {1.1, 2.2, 3.3, 4.4, 5.5};
		double[] cpy = new double[3];
		
		System.arraycopy(org, 1, cpy, 0, 3); //org 1번째에서 cpy 0으로 3개 복사.
		for(double b : cpy)
			System.out.println(b +"\t");
		System.out.println();
		
		
	}

}
