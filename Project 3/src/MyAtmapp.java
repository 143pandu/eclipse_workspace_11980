import java.util.Scanner;

public class MyAtmapp {
	static double balance = 5000.0;
	static int originalpin = 1234;
	
	public static boolean authenticat (int pin) {
		if(pin == originalpin) {
			return true;
		}
		return false;
		}
	public static void main(String[]args) {
		int pin = 0;
		Scanner in = new Scanner(System.in);
		int option = 0;
		do { 
		System.out.println("ATM APPLICATION");
		System.out.println("---------------");
		System.out.println("1.Balance Check");
		System.out.println("2. Deposite Amount");
		System.out.println("3.Withdraw Amount");
		System.out.println("0. Exit");
		System.out.println("Please select option:");
		option = in.nextInt();
		switch (option) {
		case 1:
			System.out.println("please enter pin:");
			 pin = in.nextInt();
			
			if(authenticat(pin)) {
				System.out.println("Balance:"+balance);
			}else {
				System.out.println("Invalid pin");
			}
		    break;
		    
		case 2:
			System.out.println("please enter pin");
			 pin = in.nextInt();
			if(authenticat(pin)) {
				System.out.println("please enter deposit amount:");
				double depositAmount = in.nextDouble();
				balance = balance + depositAmount;
				System.out.println("Deposite is sucessfull");
			}else {
				System.out.println("Invalid pin");
			}
			break;
			
		case 3:
			System.out.println("please enter pin");
	        pin = in.nextInt();
			if(authenticat(pin)) {
			System.out.println("please enter withdraw amount:");
			double withdrawAmount =in.nextDouble();
			balance = balance -withdrawAmount;
			System.out.println("withdraw is sucessfull!");
			}else {
				System.out.println("Invalid pin");
			}
			break;
		case 0:
			System.out.println("Thank you for using ATM");
			System.out.println("Have a nice day!");
			System.exit(0);//Terminate JVM
			break;
		default:
			System.out.println("Invalid option!");
			break;
		}
		} while (option !=0);
			
		}
		
	}

