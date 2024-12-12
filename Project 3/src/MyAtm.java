import java.until.Scanner;

public class MyAtm {
	public static void main(String[] args) {
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
			System.out.println("Balance");
			break;
		case 2:
			System.out.println("Deposite");
		case 3:
			System.out.println("Withdraw");
			break;
		case 0:
			System.out.println("Exit");
			System.exit(0);//Terminate JVM
			break;
		default:
			System.out.println("Invalid option!");
			break;
		}
		} while (option !=0);
			
		}
		

	}


