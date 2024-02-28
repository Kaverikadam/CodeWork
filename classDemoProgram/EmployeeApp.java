package com.classDemoProgram;
public class EmployeeApp {
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.empId=19;
		e1.empName="Kaveri";
		e1.empSalary=60000;
		System.out.println("ID : "+e1.empId+"\nName: "+e1.empName+"\nSalary : "+e1.empSalary);
		e1.work();
		e1.attendingMeeting();
		
		System.out.println("--------------------------------------------------------------------");
		
		Employee e2=new Employee();
		
		e2.empId=31;
		e2.empName="Kiran";
		e2.empSalary=60000;
		System.out.println("\nID : "+e2.empId+"\nName: "+e2.empName+"\nSalary : "+e2.empSalary);

		e2.attendingMeeting();
		e2.work();
		System.out.println("--------------------------------------------------------------------");

	}
}
