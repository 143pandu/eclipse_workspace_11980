
public class MethodDemo {

	public static int findSum(int x,int y) {
		return x + y;
	}
	public static void greet() {
		System.out.println("Hello everybody!");
	}
	public static double findMax(double x, double y) {
		return (x>y)? x : y;
	}
	public static void main(String[] args) {
		int total =findSum (10 ,20);
		System.out.println(total);
		
		System.out.println(findSum(200, 300));
		System.out.println(findSum(2000, 3000));
		
		greet();
		
		double max =findMax(125.4,130.5);
		System.out.println(max);
		
	}

	

}


