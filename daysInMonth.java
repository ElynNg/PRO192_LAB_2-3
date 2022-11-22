package LAB_3;

import java.util.Scanner;

public class daysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter month: ");
		int month = input.nextInt();
		System.out.println("enter year: ");
		int year = input.nextInt();
		System.out.println("Days in " + month + "." + year + " is " + daysInMonth(month, year));
	}

	public static int daysInMonth(int month, int year) {
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			return 31;
		}
		else if (month == 2) {
			if (year % 4 == 0) {
				return 29;
			}
			else {
				return 28;
			}
		}
		else {
			return 30;
		}
	}
	
}
