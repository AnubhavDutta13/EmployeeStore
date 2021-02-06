package com.empmgt.entities;

public class Employee  {

private int id;
private String name;
private Department department;



public Employee(int id, String name, Department department){
	this.setId(id);
	this.setName(name);
    this.setDepartment(department);
    
}

public void setDepartment(Department department) {
	this.department=department;
	
	
}
public Department getDepartment() {
	return department;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id=id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name=name;
}


}
