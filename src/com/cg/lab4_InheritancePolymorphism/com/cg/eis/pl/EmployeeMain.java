package com.cg.eis.pl;
import com.cg.eis.service.*;
import com.cg.eis.bean.*;

public class EmployeeMain extends EmployeeServiceImplementation {

	public static void main(String[] args) {
		EmployeeServiceImplementation temp=new EmployeeServiceImplementation();
		Employee e= temp.getDetail();
		System.out.println("Displaying details: ");
		temp.Display(e);

	}

}
