package methodDef;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		int[] ar1 = {1, 5, 4, 3, 7, 2};
		double[] ar2 = {3.3 , 2.2 , 4.4, 8.8};
		Arrays.sort(ar1);
		Arrays.sort(ar2);
		
		for(int n :ar1)
			System.out.println(n+ "\t");
		System.out.println();
		
		
		for(double d: ar2)
			System.out.println( d+"\t");
		System.out.println();
		
	}

}
