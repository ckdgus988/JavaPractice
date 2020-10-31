package methodDef;

interface Printable{
	public void print(String doc);
}

class Printer implements Printable{
	@Override
	public void print(String doc) {
		System.out.println(doc);
	}
}



public class PrintableInterface {

	public static void main(String[] args) {
		Printable prn = new Printer();
		prn.print("Hello Java");
	}

}
