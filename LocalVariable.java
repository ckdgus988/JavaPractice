package methodDef;

public class LocalVariable {

	public static void main(String[] args) {
		boolean ste = true;
		int num = 11;
		
		if(ste) {
			//int num =22;//
			num++;
			System.out.println(num);
		}
		{
		int num2 = 33;
		num2++;
		System.out.println(num2);
		}
	}

}
