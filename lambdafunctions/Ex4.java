package lambdafunctions;

@FunctionalInterface
interface Sayable{
	double say();
}
public class Ex4 {
	public int m1() {
		System.out.print("HELLO");
		return 1;
	}
	public static void main(String[] args) {
		Ex4 e = new Ex4();
		Sayable s = e::m1;
		System.out.print(s.say());
	}
}
