package lambdafunctions;

@FunctionalInterface
interface Powert{
	double xpowy(int x, int y);
}
public class Ex1 {
	public static void main(String[] args) {
		Powert power= (i1, i2)->Math.pow(i1, i2);
		int p = (int) power.xpowy(2, 3);
		System.out.println(p);
	}
}
