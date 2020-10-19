package lambdafunctions;

@FunctionalInterface
interface CalculateFactorial{
	int factorial(int i);
}
public class Ex5 {
	public int fac(int i) {
		int f = 1;
		for(int n = i; n > 0; n--) {
			f = f *n;
		}
		return f;
	}
	public static void main(String[] args) {
		Ex5 e = new Ex5();
		CalculateFactorial cF = e::fac;
		System.out.println(cF.factorial(5));
	}
}
