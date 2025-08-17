package in.vk.main;

import java.util.List;
import java.util.stream.Collectors;

public class Java8Methods {
	
	public static void main(String[] args) {
		
		List<Employee> employees = EmployeeDataBase.getAllEmployees();
		
		//forEach loop
		employees.forEach(e-> System.out.println(e.getName() + " : "+ e.getSalary() ));
		
		//filter
		List<Employee> employeeFromDev = employees.stream()
				.filter(e -> e.getDept().equals("Development"))
				.collect(Collectors.toList());
		
		System.out.println(employeeFromDev);
	}

}
