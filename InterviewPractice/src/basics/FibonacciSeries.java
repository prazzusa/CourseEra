package basics;

public class FibonacciSeries {

	public static void main(String[] args) {

		System.out.println(fibonacciNumber(6));
		System.out.println(fibNum_withoutRecursion(-1));
	}

	//Using recursion
	static int fibonacciNumber(int n) {
		if(n==0) return 0;
		if(n==1) return 1;
		return fibonacciNumber(n-1) + fibonacciNumber(n-2);
	}

	//Without using recursion
	static int fibNum_withoutRecursion(int n) {
		if(n < 0) {
			throw new IllegalArgumentException("n must not be less than 0");
		}
		if(n<2) return n;

		int f[] = new int[n+1];
		f[0] = 0;
		f[1] = 1;
		for ( int i = 2; i <= n; i++) {
			f[i] = f[i-1] + f[i-2];
		}
		return f[n];
	}
}
