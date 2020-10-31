package methodDef;

class Person {
	private int regiNum;
	private int passNum;
	
	Person(int rnum, int pnum){
		regiNum = rnum;
		passNum = pnum;
	}
	Person( int rnum){
	this(rnum,0);
	}
	
	void showPersonalInfo() {
		System.out.println("주민등록 번호: "+ regiNum);
		if(passNum!=0)
			System.out.println("여권번호:"+passNum+'\n');
		else
			System.out.println("여권을 가지고 있지않습니다.");
		
		
	}
}


public class ConOverLoading {

	public static void main(String[] args) {
		Person jung = new Person(335577, 112233);
		
		Person hong = new Person(775544);
		
		jung.showPersonalInfo();
		hong.showPersonalInfo();

	}

}
