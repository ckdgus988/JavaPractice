package methodDef;

class Box5{          //클래스 
	private String contents;
	private int boxNum;
	
	Box5 (int num, String cont){  //Box5의 메소드 
		boxNum = num;
		contents = cont;
		
	}	
	public int getBoxNum() {      //getter서서 Box5의 인스턴스값을 참조
		return boxNum; 			  //Box5 메소드로 리턴 			
	}
	public String toString() {    //toString은 뭔지 잘 모르겠음 Box5 인스턴스 내 문자열 참조?
		return contents;		  //Box5의 메소드 내 로 리턴 	
	}

			
}

public class EnhancedForInst {

	public static void main(String[] args) {
		
		Box5[] ar =  new Box5 [5];            //Box5인스턴스 생성 ar 참조변수 선 
		ar[0] = new Box5(101, "Coffee");
		ar[1] = new Box5(202, "Computer");
		ar[2] = new Box5(303, "Apple");
		ar[3] = new Box5(404, "Dress");
		ar[4] = new Box5(505, "Fairy-tale book");     //아래 실행 
		
		for(Box5 e: ar) {  // Box5의 배열형 ar의 배열값(101,"coffee" ~~ 505,"Fairy-tale book" 까지 e 에 담는다.  
			if(e.getBoxNum()==505)           //여기서 이게 왜 getBoxNum인지 모르 겠음. Box5클래스에서 getBoxNum에서 받은값을 Box5로 리턴해주고 여기에 그냥e.Box5쓰는거 아님? 해보니까 오류뜨긴함
				System.out.println(e);
		}
	}

}
