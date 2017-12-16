

/*
	ISYS 320
	Name(s):
	Date: 
*/

public class P5_ScalableBox {

	private static int windowWidth;
	private static int windowHeight;

	public static void main(String[] args) {
		// Extracted properties out as class fields.
		windowWidth = 8; // Could be set by an args[0] value
		windowHeight = 10; // Could be set by an args[1] value
		drawBoxCap(windowWidth);
		drawBoxInsides(windowHeight);
		drawBoxCap(windowWidth);
	}
	
	public static void drawBoxCap(int width) {
		System.out.print("+");
		
		for( int capDashIndex = 1; capDashIndex <= width - 2; capDashIndex++ ) {
			System.out.print("-");
		}
		
		System.out.println("+");
	}
	
	public static void drawBoxInsides(int height) {
		for( int insideRowIndex = 1; insideRowIndex <= height - 2; insideRowIndex++ ) {
			drawBoxInsideLine();
		}
	}
	
	public static void drawBoxInsideLine() {
		System.out.print("|");
		
		for( int insideRowIndex = 1; insideRowIndex <= windowWidth - 2; insideRowIndex++ ) {
			System.out.print(".");
		}
		
		System.out.println("|");
	}

}
