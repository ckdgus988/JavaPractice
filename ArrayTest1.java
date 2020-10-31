package methodDef;

public class ArrayTest1 {

	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5};
		
		for (int e : ar) {
			System.out.println(e+" ");
			
		}
	
		System.out.println();
		int sum = 0;
		
	for(int e: ar) {
		sum += e;
	}
	System.out.println("sum : "+sum);
	
}
}