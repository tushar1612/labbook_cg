package lambdafunctions;

@FunctionalInterface
interface Validate{
	boolean validateUserNamePassword(String username, String password);
}
public class Ex3 {
	public static void main(String[] args) {
		Validate validate = (i1, i2)->{
			if(i1 != "RAJ" || i2 != "Simran") {
				return false;
			}
			return true;
		};
		boolean check = validate.validateUserNamePassword("RAJ", "Simran");
		System.out.println(check);
	}
}
