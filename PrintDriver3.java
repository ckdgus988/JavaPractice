package methodDef;

 interface Printable4{
	 void print (String doc);
 }

 interface ColorPrintable extends  Printable4{
	 void printCMYK(String doc);
 }
 
 class Prn909Drv implements ColorPrintable{
	 @Override
	 public void print(String doc) {
		 System.out.println("From MD 909 black & White ver");
		 System.out.println(doc);
		 
	 }
	 
	 @Override 
	 public void printCMYK(String doc) {
		 System.out.println("From MD-909 CMYK ver");
		 System.out.println(doc);
	 }
 }

public class PrintDriver3 {

	public static void main(String[] args) {
		String myDoc = "This is report about...";
		ColorPrintable prn = new Prn909Drv();
		prn.print(myDoc);
		System.out.println();
		prn.printCMYK(myDoc);
	
	}

}
