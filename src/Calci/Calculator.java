package Calci;

import java.util.Scanner;

public class Calculator {

	public static int add(int number1, int number2) {
		return number1 + number2;
	}

	public static int sub(int number1, int number2) {
		return number1 - number2;
	}

	public static int mul(int number1, int number2) {
		return number1 * number2;
	}

	public static double div(double number1, double number2) {
		if (number2 == 0) {
			throw new IllegalArgumentException("Number cannot be divide by 0");
		}
		return number1 / number2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Number:");
		int input = sc.nextInt();

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the Second Number:");
		int input1 = sc.nextInt();

		System.out.println("The Addition is:" + Calculator.add(input, input1));
		System.out.println(" The Subtraction is:" +Calculator.sub(input, input1));
		System.out.println(" The Multiplication is:" +Calculator.mul(input, input1));
		System.out.println( "The Division is:" +Calculator.div(input, input1));

	}
}