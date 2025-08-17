package in.vk.main;

import java.util.List;

public class Java8Methods {
	
	public static void main(String[] args) {
		
		List<Employee> employees = EmployeeDataBase.getAllEmployees();
		
		//forEach loop
		employees.forEach(e-> System.out.println(e.getName() + " : "+ e.getSalary() ));
	}

}
