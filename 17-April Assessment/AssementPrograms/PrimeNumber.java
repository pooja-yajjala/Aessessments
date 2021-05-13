package com.ojas.assesment;

import java.util.Scanner;

public class PrimeNumber {
	public static String isPrime(int num){
		boolean flag = false;
		for(int i=2;i<=num/2;i++) {
			if(num%i ==0)
				flag = true;
			break;
		}
	String a;
		if(flag == false)
			a = num + " is a prime number";
		else
			a = num + " is not a prime number";
		return a;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		System.out.println(isPrime(scan.nextInt()));
	}
}
