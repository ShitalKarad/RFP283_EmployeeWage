package com.brigelabz;

public class EpmployeeWageCalculation {
	public static void main(String[] args) {
		int present = 1;
		int upsent = 0;
	    final int wage_per_hour = 20;
	    final int full_day_hour = 8;
		int checkRandom = (int) (Math.floor(Math.random() * 10)%2);
		int totalWage = 0;
		if (checkRandom == 1) {
			totalWage = wage_per_hour * full_day_hour;
			System.out.println("Employee is present "+totalWage);
		}
		else {
			
			System.out.println("Employee is upsent " +totalWage);
			
		}
		
	}
}
