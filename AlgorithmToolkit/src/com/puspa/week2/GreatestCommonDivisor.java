package com.puspa.week2;

import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		//System.out.println(getGCD(15,12));
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		System.out.println(euclideanGDC(n1, n2));
	}

	//Naive Algorithm
	/*static int getGCD(int num, int din) {
		int gcd = 0;
		for(int i=1;i<=(num+din);i++) {
			if((num % i == 0) && (din % i == 0)) {
				gcd = i;
			}
		}
		return gcd;
	}
*/
	

//Efficient Algorithm
	public static int euclideanGDC(int num, int din) {
		if(din == 0) return num;
		int numMod = num % din;
		
		return euclideanGDC(din, numMod);
		
	}
	
}
