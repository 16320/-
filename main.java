package masiv;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		double p1 = 0;
		double p2 = 0;
		double p3 = 0;
		double p4 = 0;
		double p5 = 0;
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		int c4 = 0;
		int c5 = 0;
		for (int i = 0; i <= n; i++) {
			int currentNumber = Integer.parseInt(sc.nextLine());
			if (currentNumber < 200) {
				c1++;
			} else if (currentNumber > 200 && currentNumber < 399) {
				c2++;
			} else if (currentNumber > 400 && currentNumber < 599) {
				c3++;
			} else if (currentNumber > 600 && currentNumber < 799) {
				c4++;
			} else {
				c5++;
			}
		}
		p1 = c1 * 100 / n;
		p2 = c2 * 100 / n;
		p3 = c3 * 100 / n;
		p4 = c4 * 100 / n;
		p5 = c5 * 100 / n;
		System.out.println(String.format("%.2f%%", p1));
		System.out.println(String.format("%.2f%%", p2));
		System.out.println(String.format("%.2f%%", p3));
		System.out.println(String.format("%.2f%%", p4));
		System.out.println(String.format("%.2f%%", p5));

	}

}
