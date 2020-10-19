package layerarchitectue.com.cg.eis.service;

import LayeredArchitecture.com.cg.eis.bean.Employee;

public interface EmployeeService {

	void addEmployee(Employee emp);

	String getEmployeeByInsuranceScheme(String insuranceScheme);

	boolean deleteEmployee(int id);
}
