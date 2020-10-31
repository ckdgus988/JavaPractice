package methodDef;

class ParrentAdder {
	public int add(int a, int b) {
		return a+b;
	}
}

class ChildAdder extends ParrentAdder {
@Override  //  int형과 dopuble형으로 오버로딩이 되어있는걸 쓰고 싶은게 아닌 add메소드로 덮어버리는 오버라이딩을 쓰고 싶어서!!
	public double add (double a, double b) {
		System.out.println("덧셈을 합니다.");
		return a+b;
	}
}
public class OverrideMistake {

	public static void main(String[] args) {
		ParrentAdder adder = new ChildAdder();
		System.out.println(adder.add(3.0,4.0));
	}

}
