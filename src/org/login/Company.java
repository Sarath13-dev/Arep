package org.login;

//Child class
public class Company extends Employee{

	private void companyId() {
		System.out.println("company id is 1234");
	}
	
	private void companyName() {
		System.out.println("company name is greens");
	}
	
	public static void main(String[] args) {
		
		Company a = new Company();
		a.companyId();
		a.companyName();
		a.empId();
		a.empName();
		
		
		
	}
}
