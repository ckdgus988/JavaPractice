package methodDef;

interface Printable5{
	void print(String doc);
	default void printCMYK(String doc) {  }
	
}

class Prn731Drv1 implements Printable5{
	@Override 
	public void print(String doc) {
		System.out.println("From MD-731 printer");
		System.out.println(doc);
	}
}


class Prn909Drv1 implements Printable5{
	@Override
	public void print(String doc) {
		System.out.println("From MD-909 blakc & white ver");
		System.out.println(doc);
	}


	@Override
	public void printCMYK(String doc) {
		System.out.println("From MD-909 CMYK ver");
		System.out.println(doc);
	}
}

public class PrintDriver4 {

	public static void main(String[] args) {
		String myDoc = "This is report about";
		Printable5 prn1 = new Prn731Drv1();
		prn1.print(myDoc);
		System.out.println();
		
		Printable5 prn2 = new Prn909Drv1();
		prn2.print(myDoc);
		
	}

}
