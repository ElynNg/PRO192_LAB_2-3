package LAB_3;

import java.util.Scanner;

public class colors {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("What color do you want? ");
		String color = input.next().toUpperCase();
		if (color.equalsIgnoreCase("R")) {
			System.out.println("You have chosen Red");
		}
		else if (color.equalsIgnoreCase("G")) {
			System.out.println("You have chosen Green");
		}
		else if (color.equalsIgnoreCase("B")) {
			System.out.println("You have chosen Blue");
		}
		else {
			System.out.println("Unknown color: " + color);
		}
		
	}
}
