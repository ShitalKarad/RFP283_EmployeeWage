package com.brigelabz;

public class EpmployeeWageCalculation {
	public static void main(String[] args) {
		int present = 1;
		int upsent = 0;
		int checkRandom = (int) (Math.floor(Math.random() * 10)%2);
		
		if (checkRandom == 1) {
			System.out.println("Employee is present");
		}
		else {
			System.out.println("Employee is upsent");
		}
		
	}
}
