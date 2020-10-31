package methodDef;

interface Printable1{
	public void print(String doc);
}
	
	class SPrinterDriver implements Printable1{
		@Override
		public void print(String doc) {
			System.out.println("From Samsung printer");
			System.out.println(doc);
		}
	}

	class LPrinterDriver implements Printable1{
		@Override
		public void print(String doc) {
			System.out.println("From LG printer");
			System.out.println(doc);
		}
	}

public class PrintDriver {

	public static void main(String[] args) {
		String myDoc ="This is a report about...";
		
		//삼성프린트 출력
		Printable1 prn = new SPrinterDriver();
		prn.print(myDoc);
		System.out.println();
		
		//lg프린터
		prn = new LPrinterDriver();
		prn.print(myDoc);
		
	}

}
