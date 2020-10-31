package methodDef;

class Point{
	private int xPos;
	private int yPos;
	
	public Point(int x, int y) {
		xPos = x;
		yPos = y;
		
	}
	
	public boolean equals(Object obj) {
		Point p =(Point)obj;  	//p와 매개변수 obj 
		
		if(xPos == p.xPos && yPos == p.yPos)
			return true;
		else
			return false;
	}
	
}


public class Rectangel {
	private Point upperLeft;
	private Point lowerRight;
	
	public Rectangel(int x1, int y1, int x2 , int y2) {
		upperLeft = new Point(x1, y1);
		lowerRight = new Point(x2, y2);
	}
	
	public boolean equals(Object obj) {
		Rectangel r = (Rectangel)obj;
		
		if(upperLeft.equals(r.upperLeft) && lowerRight.equals(r.lowerRight))
			return true;
		else	 
		return false;
		
}


	public static void main(String[] args) {
		Point p1 = new Point(3, 4);
		Point p2 = new Point(3, 4);
		
		Rectangel r1 = new Rectangel (1,2,3,4);
		Rectangel r2 = new Rectangel (1,2,3,4);
		
		if(p1.equals(p2))
			System.out.println("서로 값이 같습니다.");
		else
			System.out.println("서로 값이 다릅니다.");
		
		if(r1.equals(r2))
			System.out.println("서로 값이 같습니다.");
		else
			System.out.println("서로 값이 다릅니다.");
		
				
	}

}
