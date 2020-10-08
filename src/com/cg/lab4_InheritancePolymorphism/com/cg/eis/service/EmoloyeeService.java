package com.cg.eis.service;
import com.cg.eis.bean.*;
public interface EmoloyeeService {
	public Employee getDetail();
	public String findInsuranceScheme(double salary);
	public void Display(Employee e);
	
}
