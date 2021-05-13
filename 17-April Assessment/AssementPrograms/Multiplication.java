package com.ojas.assesment;

import java.util.Scanner;

public class Multiplication {
	public static String isMultiplication(int num,int range){
		String res = "";
		for(int row = 1; row <= range ; row++){
			res += num + " " + "*" + " " + row + " " + " = " + " " + num * row +  "\n" ;
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number : ");
		int number = scan.nextInt();
		System.out.println("enter the range : ");
		int range = scan.nextInt();
		System.out.println(isMultiplication(number,range));
	}
}
