
public class Array {

	public static void main(String[] args) {
		//1.Array Declaration
		int[] arr1;//recommended
		int[]arr2;
		int[]arr3;
		//int[10] arr4;//CE
		
		//2. Array Creation
		arr1 =new int[10];
		//arr2 = new int[];//RE
		arr2 = new int[0];
		
		//3.Array Initialization
		arr1[0] = 44;
		arr1[1] = 55;
		arr1[2] = 66;
		
		//4.Access Array Element
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[9]);
		//System.out.println(arr1[10]);//RE
		
		//Array Declaration, Creation and Initialization at a time
		int[] arr4 = new int[] {44,55,66,77,88,99};
		
		int[] arr5 = {44,55,66,77,88,99,};
		
		// find size of array
		System.out.println(arr4.length);
		System.out.println(arr5.length);
		
		//Array Traversal
		double[] salaries = {55000.0, 45000.0, 35000.0, 25000.0,};
		
		System.out.println("Using for loop");
		
		int size = salaries.length;
		
		for(int index =0; index < size ; index++) {
			System.out.println(salaries[index]);
			
		}
		
		
		System.out.println("Using for each loop");
		for(double salary : salaries) {
			System.out.println(salary);
			
		}
		
		
		String[] employees = {"Wills", "Smith", "Alex" ,"Anna"};
		
		  for(String employee:employees) {
			  System.out.println(employee);
		  }
		  
		  int[] subjectMarks = {55,44,99,77,88,66};
		  int totalMarks = 0;
		  for(int marks:subjectMarks) {
			  totalMarks+= marks;	  
		  }
		  System.out.println("Total subject marks = "+totalMarks);
		  System.out.println("Average subject marks = "+(totalMarks/subjectMarks.length));
		  
		// min ele in an array
		  int min = subjectMarks[0];
		  for(int marks : subjectMarks) {
		  if(min > marks) {
		  min = marks;
		  }
		  }
		  System.out.println("Minimum marks : "+min);

		  // max ele in an array
		  int max = subjectMarks[0];
		  for(int marks : subjectMarks) {
		  if(max < marks) {
		  max = marks;
		  }
		  }
		  System.out.println("Maximum marks = "+max);

		  // searching an ele
		  int search = 50;
		  for(int i=0; i<subjectMarks.length; i++) {
		  if(subjectMarks[i] == search) {
		  System.out.println("Element found at "+i);
		  System.exit(0);
		  }
		  }
		  System.out.println("Element not found");
		  
		  //Hetrogeneous elements
		  Object[] objArray = {10,"Jones", 45000.0, true};
		  
		  int element1 = (int) objArray[0];
		  String element2 = (String) objArray[1];
		  double element3 = (double) objArray[2];
		  System.out.println(element1);
		  System.out.println(element2);
		  System.out.println(element3);
	}
		  










		  }
		  
		  
		  
		  
		  
		 
		  
		  
		
		

	


