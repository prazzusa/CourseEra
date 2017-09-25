package com.puspa.week2;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		System.out.println(getGCD(15,12));
	}

	//Naive Algorithm
	static int getGCD(int num, int din) {
		int gcd = 0;
		for(int i=1;i<=(num+din);i++) {
			if((num % i == 0) && (din % i == 0)) {
				gcd = i;
			}
		}
		return gcd;
	}

}

