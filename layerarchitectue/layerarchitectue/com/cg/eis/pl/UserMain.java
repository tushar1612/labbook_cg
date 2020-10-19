package layerarchitectue.layerarchitectue.com.cg.eis.pl;
import java.util.*;


//import layerarchitectue.com.cg.eis.service;
import LayeredArchitecture.com.cg.eis.bean.Employee;
import layerarchitectue.com.cg.eis.service.EmployeeService;
import layerarchitectue.com.cg.eis.service.EmployeeServiceClass;

public class UserMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee(sc.nextInt(), sc.next(), sc.nextDouble());
		EmployeeService empService = new EmployeeServiceClass();
		empService.addEmployee(employee);
		System.out.print(empService.getEmployeeByInsuranceScheme("Scheme B"));
	}
}
