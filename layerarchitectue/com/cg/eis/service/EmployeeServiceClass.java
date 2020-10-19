package layerarchitectue.com.cg.eis.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import LayeredArchitecture.com.cg.eis.bean.Employee;

public class EmployeeServiceClass implements EmployeeService {

	// Collections<Integer> a = new ArrayList<Integer>();
	static HashMap<Integer, Employee> hm = new HashMap<Integer, Employee>();

	@Override
	public void addEmployee(Employee emp) {
		hm.put(emp.getId(), emp);
	}

	@Override
	public String getEmployeeByInsuranceScheme(String insuranceScheme) {
		String s = "";
		for (Employee emp : hm.values()) {
			emp.setInsuranceScheme();
			emp.setDesignation();
			if (emp.getInsuranceScheme().equals(insuranceScheme)) {
				s = "Name: " + emp.getName() + " Id: " + emp.getId() + " Salary: " + emp.getSalary() + " Designation: "
						+ emp.getDesignation() + " InsuranceScheme: " + emp.getInsuranceScheme() + "\n";
			}
		}
		return s;
	}

	@Override
	public boolean deleteEmployee(int id) {
		for(Employee emp: hm.values()) {
			if(emp.getId() == id) {
				hm.remove(id);
				return true;
			}
		}
		return false;
	}

}
