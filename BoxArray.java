package methodDef;

class Box4{
	private String conts;
	
	Box4(String cont){
		this.conts=cont;
	}
	
	public String toString() {
		return conts;
		
	}
}

public class BoxArray {

	public static void main(String[] args) {
		
		Box4 ar [] = new Box4[3];
		
		ar[0] = new Box4("First");
		ar[1] = new Box4("Second");
		ar[2] = new Box4("Third");
		
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		
	}

}
