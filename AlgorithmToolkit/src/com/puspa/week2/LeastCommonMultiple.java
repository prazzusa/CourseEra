package com.puspa.week2;

import java.util.Scanner;

public class LeastCommonMultiple {
	
	public static void main(String[] args) {
		System.out.println(getGCD(14159572,63967072));
		Scanner sc = new Scanner(System.in);
		long n1 = sc.nextLong();
		long n2 = sc.nextLong();
		System.out.println(getLCM(n1,n2));
		//System.out.println(getLCM(14159572,63967072));
	}
	
	public static long getLCM(long a, long b) {
		if(a ==0 || b==0) return 0;
		long lcm = 0;
		lcm = (a *b) /getGCD(a, b);
		return lcm;
		
	}
	
	public static long getGCD(long a, long b) {
		if(b == 0) return a;
		long aMod =  a % b;
		
		return getGCD(b,aMod);
	}

}
