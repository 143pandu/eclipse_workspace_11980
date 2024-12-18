
public class InterfaceDemo {
	
	public static void main (String[] ards) {
		
		MyCalc myCalc = new MyCalc();
		System.out.println(myCalc.sum(10 , 5));
		System.out.println(myCalc.sub(10 , 5));
		System.out.println(myCalc.mul(10 , 5));
		System.out.println(myCalc.div(10 , 5));
		System.out.println(myCalc.findCube(10));
		
		
		System.out.println(Calc.doubleIt(10));
		System.out.println(myCalc.PI_VALUE);
		System.out.println(myCalc.PI_VALUE);
		
		
		System.out.println("------------------");
		
		Calc c = new MyCalc();
		System.out.println(c.sum(4 , 7));
		System.out.println(c.sub(4 , 7));
		System.out.println(c.mul(4 , 7));
		System.out.println(c.div(4 , 7));
		System.out.println(c.findSquare(10));
		System.out.println(c.findCube(10));
		
		
		
		
		
		
		
		
		
		
		
		
	}

	}
