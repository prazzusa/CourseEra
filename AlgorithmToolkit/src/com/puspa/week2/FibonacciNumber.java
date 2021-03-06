package com.puspa.week2;

import java.util.Scanner;

public class FibonacciNumber {
	
	public static int getFibonacciNumber(int n) {
		if(n < 2) return n;
		int fibArray[] = new int[n+1];
		fibArray[0] = 0;
		fibArray[1] = 1;
		
		for (int i = 2; i <= n; i++) {
			fibArray[i] = fibArray[i-1] + fibArray[i-2];
		}
		return fibArray[n];
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(getFibonacciNumber(n));
	}

}
