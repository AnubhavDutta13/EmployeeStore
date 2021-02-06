package com.empmgt.ui;


import com.empmgt.entities.*;

public class EmployeeMain {

	public static void main(String args[]) {
		EmployeeMain project = new EmployeeMain();
		project.start();
	}

	public void start() {
		Employee employeestore[]=new Employee[4];
		Department dep1 = new Department("d1", "R&D");
		Department dep2 = new Department("d2", "UI&UX");
		
		Developer dev1=new Developer(1,"Arpan",dep1,"Javascript");
		Developer dev2=new Developer(2,"Anubhav",dep2,"Java");
		
		Tester test1=new Tester(3,"Rishi",dep1,"Dagger");
		Tester test2=new Tester(4,"Alifia",dep2,"Postman");
		
		employeestore[0]=dev1;
		employeestore[1]=dev2;
		employeestore[2]=test1;
		employeestore[3]=test2;
		
		for(int i=0;i<employeestore.length;i++) {
			Employee iteratedEmployee=employeestore[i];
			int id=iteratedEmployee.getId();
			String name=iteratedEmployee.getName();
		   Department department=iteratedEmployee.getDepartment();
		   boolean isDeveloper = iteratedEmployee  instanceof Developer;
		   if(isDeveloper) {
			   Developer developer1=(Developer) iteratedEmployee;
			   displayEmployee(developer1);
		   }else {
			   Tester tester1=(Tester) iteratedEmployee;
			   displayEmployee(tester1);
		   }
		}
		
		
	}
	void displayBaseEmployee(Employee employee) {
		int id = employee.getId();
		String name = employee.getName();
		Department department=employee.getDepartment();
		System.out.println("EmployeeId = " + id + " Name = " + name);
		System.out.println("Department is " + department.getDeptId() + " Department Name = " + department.getDeptName());

	}
	void displayEmployee(Developer developer) {
		displayBaseEmployee(developer);
		String language = developer.getLanguage();
		System.out.println("Developer's language " + language);
		System.out.println("----------------------------------");
		
	}

	void displayEmployee(Tester tester) {
		displayBaseEmployee(tester);
		String tool = tester.getTools();
		System.out.println("Tester's tool " + tool);
		System.out.println("----------------------------------");
	}

}
