
public class EmployeeService {
	private Employee[] employees = new Employee[10];
	
	public void addEmployee(int index, Employee emp) {
		employees[index] = emp;
	}
	
	public Employee[] getAllEmployee() {
		return employees;
		
	}
	
	public Employee getEmployee(int index) {
		return employees[index];
		
	}
	
}
