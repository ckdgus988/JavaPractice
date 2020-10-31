package methodDef;

public class TwoDiemenArrayTest {

	public static void main(String[] args) {
		int arr[][] = new int [3][3];
		int num = 1;
		
		for(int i =0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				arr[i][j] =num;
				num++;
			}
		}
		
		for(int i =0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
			if(arr[i][0] >num+7) {
				System.out.print(arr[i][j]+"\t");
			}else {
				
				System.out.print(arr[i][j]+"\t");
			}
	}System.out.println();

}
}}