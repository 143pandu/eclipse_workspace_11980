
public class Employee {

		//Instance props
		int employeeId;
		String employeeName;
		double employeeSalary;
		
		//Constructor
		static String employeeOrganization = "Edubridge";
		public Employee(int employeeId,String employeeName,double employeeSalary) {
		    this.employeeId = employeeId;
		    this.employeeName = employeeName;
		    this.employeeSalary = employeeSalary;
	}
	
	//Instance Method
	public void displayDetails() {
		System.out.println("Employee Id:"+employeeId);
		System.out.println("Employee Name:"+employeeName);
		System.out.println("Employee Salary:"+employeeSalary);
	}
		
		

	}


