package methodDef;

import java.util.Arrays;

public class CopyOfArrays {

	public static void main(String[] args) {
		double[] arOrg = {1.1, 2.2, 3.3, 4.4, 5.5};
		
		double[] cpy1 = Arrays.copyOf (arOrg, arOrg.length);
		double[] cpy2 = Arrays.copyOf(arOrg,  1);
		
		for(double d: cpy1) 
			System.out.print(d+"\t");
			System.out.println();
			
			for(double d: cpy2)
				System.out.println(d+"\t");
	}

}
