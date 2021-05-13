package com.ojas.assesment;

import java.util.Scanner;

public class OddInRange {
	public static void OddInRange(int start,int end){
		for(int row =start; row <= end; row++){
			if(row % 2!= 0)
				System.out.print(row + " ");
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the start-range : ");
		int start = scan.nextInt();
		System.out.println("enter the end-range : ");
		int end = scan.nextInt();
		OddInRange(start,end);

	}
}
