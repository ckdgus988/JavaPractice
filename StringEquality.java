package methodDef;

public class StringEquality {

	public static void main(String[] args) {
		String str1 = new String("so Simple");
		String str2 = new String("so Simple");

		if(str1 == str2)
			System.out.println("str1, str2참조대상이 같다.");
		else
			System.out.println("str1, str2 참조대상이 다르다.");  //참조대상 비
		
		if(str1.equals(str2))
			System.out.println("str1, str2 참조대상이 같다."); //내용 비
		else
			System.out.println("str1m str2 참조대상이 다르다.");
		
			

	}

}
