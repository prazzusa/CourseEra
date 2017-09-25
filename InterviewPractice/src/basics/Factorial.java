package basics;

public class Factorial {
	
	public static void main(String[] args) {
		System.out.println(calculateFactorial_withRecursion(5));
		System.out.println(calculateFactorial_withoutRecursion(-1));
	}
	
	// using recursion
	static int calculateFactorial_withRecursion(int n) {
		if(n < 0) {
			throw new IllegalArgumentException("n must not be less than 0");
		}
		if(n==0) return 1;
		
		return n * calculateFactorial_withRecursion(n-1);
	}
	
	//without using recursion
	static int calculateFactorial_withoutRecursion(long n) {
		long factorial = 1;
		
		for (int i = 1; i<=n; i++) {
			factorial *= i;
		}
		return (int) factorial;
		
	}

}
