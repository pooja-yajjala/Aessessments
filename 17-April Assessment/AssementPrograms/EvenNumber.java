package com.ojas.assesment;

import java.util.Scanner;

public class EvenNumber {
		
		public static void evenOrOdd(int num){
			if(num % 2 == 0){
				System.out.println(num +" is a even number ");
			}
			else 
				System.out.println(num +" is a odd number ");
		}
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("enter the number : ");
			int number = scan.nextInt();
			evenOrOdd(number);
		}
	}