package masiv;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double p1 = Double.parseDouble(scanner.nextLine());
		double p2 = Double.parseDouble(scanner.nextLine());
		char p3 = scanner.next().charAt(0);
		double sum = 0;

		if (p3 == '+') {
			sum = p1 + p2;
			System.out.println(sum);
			if (sum % 2 == 0) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
		} else if (p3 == '-') {
			sum = p1 - p2;
			System.out.println(sum);
			if (sum % 2 == 0) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
		} else if (p3 == '*') {
			sum = p1 * p2;
			System.out.println(sum);
			if (sum % 2 == 0) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}

		} else if (p3 == '/') {
			sum = p1 / p2;
			System.out.println(sum);

		} else if (p3 == '%') {
			if (p1 == 0) {
				System.out.println("Cannot divide " + p1 + " by zero");
			} else if (p2 == 0) {
				System.out.println("Cannot divide " + p1 + " by zero");
			} else {
				sum = p1 % p2;
				System.out.println(sum);
			}

		}
	}

}
