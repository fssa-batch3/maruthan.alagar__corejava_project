package com.fssa.corejava.day03.solved;

public class TestAccount {
	public static void main(String[] args) {

		// create Account
		Account acct1 = new Account("A10096", "Maruthan", 10000);
		System.out.println(acct1.accNo + " - " + acct1.name + " - " + acct1.balance);

		// create Account
		Account acct2 = new Account("A10089", "Dhanush", 100000);
		System.out.println(acct2.accNo + " - " + acct2.name + " - " + acct2.balance);
	}

}
