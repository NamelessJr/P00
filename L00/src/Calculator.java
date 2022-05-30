
public class Calculator {
	public int add (int a, int b) {
		 return a + b;
		}
	
	public int subtract (int a, int b) {
		if( b < 1) {
			throw new IllegalArgumentException("b cannot be less than 1");	
		}
		 return a - b;
	}
	public int multiply (int a, int b) {
			return a * b;
		}

	public int divide (int a, int b) {
		if( b==0 ) {
			throw new IllegalArgumentException("b cannot be 0");	
		}
		return a / b;
	}
	
	private boolean checkValid (int a, int b) {
		if (a >= 0 && a <= 9999 && b > 0 && b <=9999) {
			return true;	
		}
		else {
			return false;
		}
	}


}
