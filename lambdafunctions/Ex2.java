package lambdafunctions;

@FunctionalInterface
interface Spacing{
	void applySpace(String let);
}
public class Ex2 {
	public static void main(String[] args) {
		Spacing space = i->{char[] ch = i.toCharArray(); String n = "";
		for(int j=0; j<ch.length-1; j++) {
			n +=  ch[j] + " ";}
			n += ch[ch.length-1];
			System.out.print(n);
		};
		space.applySpace("CG");
	}
}
