//import java.util.Scanner;
 
public class Employee {
//instance props
		int employeeId;
		String employeeName;
		double employeeSalary;


		static String employeeOrganization = "Edubridge"; 
			public Employee(int employeeId, String employeeName, double employeeSalary) {
					this.employeeId = employeeId;
					this.employeeName = employeeName;
					this.employeeSalary = employeeSalary;
	}

//instance Method
		public void displayDetails() {
			System.out.println("Employee Id: "+ employeeId);
			System.out.println("Employee Name: "+employeeName);
			System.out.println("Employee Salary:" +employeeSalary);
			System.out.println("Employee organization:" +employeeOrganization);

		}
// method override 
		public String toString() {
			return employeeId + "\t" + employeeName + "\t" + employeeSalary;
		}


}

