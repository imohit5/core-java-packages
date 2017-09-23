package com.corejava.demo.sum;

import java.util.Scanner;

public class AdditionTwoNumbers {

	public static void main(String[] args) {

		System.out.println("Please enter two numbers");
		Scanner scanner = new Scanner(System.in);
		int number1 = Integer.parseInt(scanner.next());
		int number2 = Integer.parseInt(scanner.next());
		int sum = number1 + number2;
		System.out.println("Sum of two entered numbers is "+sum);
	}

}
