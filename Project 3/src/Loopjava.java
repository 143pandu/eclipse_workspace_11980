
public class Loopjava {

	public static void printNumbers(int start, int end) throws InterruptedException{
	    System.out.println("start...");
	    while(start <= end) {
	    System.out.println("Count:"+start);
	    Thread.sleep(1000 * 1);
	    start++;
	    }
	    System.out.println("end...");
	}   
	
	//print squares and cube up to the given number
	    public static void printSquaresAndCubes(int num){
	    system.out.printlnprintln("Num\tSquare\tcube");
	    for(int i=1; i<=num; i++) {
	         system.out.println(i+"\t"+(i*i)+"\t"+(i*i*i));
	         }
	         }
	         
	    print static void main(String[] args) throws InterruptedException {
	        printNumbers(1,10);
	        printlnSquareAndCube;
	    }


	}

   
