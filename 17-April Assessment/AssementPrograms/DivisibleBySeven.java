package com.ojas.assesment;

import java.util.Scanner;

public class DivisibleBySeven {
	public static boolean divisibleBySeven(int num){
		if(num < 0){
			return divisibleBySeven(-num);
		}
		if(num == 0 || num == 7)
			return true;
		if(num < 10)
			return false;
		return divisibleBySeven(num / 10 - 2 * (num - num / 10 * 10));
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number : ");
		int num = scan.nextInt();
		divisibleBySeven(num);
		if(divisibleBySeven(num))
			System.out.println(num + " is divisible by 7");
		else
			System.out.println(num + " is not divisible by 7");
	}
}
