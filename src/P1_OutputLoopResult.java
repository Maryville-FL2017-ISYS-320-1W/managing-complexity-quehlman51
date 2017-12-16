/*
  	ISYS 320
  	Name(s):
  	Date: 
*/



public class P1_OutputLoopResult {
	static int finalResult;
	static int printSumOfSquaresTo5;
	

	public static void main(String[] args) {
		printSumOfSquaresTo5();
	}
	
	public static void printSumOfSquaresTo5() {
		int finalResult = 0;
		for( int i = 1; i <= 5; i++ ) {
			finalResult = finalResult + i * i;
			
				
		}
		
		System.out.println("Final result is: " + finalResult);
		
	}

}
