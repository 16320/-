package masiv;

import java.util.Scanner;

public class diamond {
	static void repeat(int m, String str) {
		for (int i = 0; i < m; i++) {
			System.out.print(str);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		repeat(n, ".");
		repeat(3 * n, "*");
		repeat(n, ".");
		System.out.println();
		for (int row = 1; row < n; row++) {
			repeat(n - row, ".");
			System.out.print("*");
			repeat(2 * row + 3 * n - 2, ".");
			System.out.print("*");
			repeat(n - row, ".");
			System.out.println();
		}
		repeat(5 * n, "*");
		System.out.println();
		for (int row = 2 * n; row > 0; row--) {
			repeat(2 * n + 1 - row, ".");
			System.out.print("*");
			repeat(2 * row + n - 4, ".");
			System.out.print("*");
			repeat(2 * n + 1 - row, ".");
			System.out.println();
		}
		repeat(2 * n + 1, ".");
		repeat(n - 2, "*");
		repeat(2*n+1,".");

	}

}
