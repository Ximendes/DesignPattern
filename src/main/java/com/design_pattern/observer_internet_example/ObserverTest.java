package com.design_pattern.observer_internet_example;

public class ObserverTest {

	public static void main() {
		Newspaper printMedia = new Newspaper();
		Internet onlineMedia = new Internet();

		Loan personalLoan = new Loan("Personal Loan", 12.5f, "Standard Charterd");
		personalLoan.registerObserver(printMedia);
		personalLoan.registerObserver(onlineMedia);
		personalLoan.setInterest(3.5f);
	}
}
