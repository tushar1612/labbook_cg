package com.cg.eis.service;
import com.cg.eis.bean.*;

import java.util.Scanner;

import com.cg.eis.bean.Employee;

public class EmployeeServiceImplementation implements EmoloyeeService {
	Scanner sc=new Scanner(System.in);
	public Employee getDetail() {
		System.out.println("Enter int id;String name;double salary;String designation");
		int id=sc.nextInt();
		String name=sc.next();
		double salary=sc.nextDouble();
		String designation=sc.next();
		String insuranceScheme=findInsuranceScheme(salary);
		Employee emp=new Employee(id, name, salary, designation, insuranceScheme);
		return emp;
	}
	public String findInsuranceScheme(double salary) {
		if(salary>1000) {
			return "Scheme A";
		}
		else
			return "Scheme B";
	}
	public void Display(Employee e) {
		System.out.println("Name: "+e.getName());
		System.out.println("Id: "+e.getId());
		System.out.println("Salary: "+e.getSalary());
		System.out.println("Designation: "+e.getDesignation());
		System.out.println("Insrance Scheme: "+e.getInsuranceScheme());
	}
}
