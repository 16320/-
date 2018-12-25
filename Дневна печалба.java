package masiv;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int workDays = Integer.parseInt(sc.nextLine());
		double moneyPerDay = Double.parseDouble(sc.nextLine());
		double currencyRate = Double.parseDouble(sc.nextLine());
		double monthSalary = workDays * moneyPerDay;
		double moneyPerYear = (monthSalary * 12) + (monthSalary * 2.5);
		double taxes = 0.25 * moneyPerYear;
		double netSalary = moneyPerYear - taxes;
		double salaryInLeva = netSalary * currencyRate;
		double average = salaryInLeva / 365;
		System.out.printf("%.2f" , average);
	}

}
