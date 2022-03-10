package com.bank;

public class Main {

	public static void main(String[] args) {
		
		HomeLoan hLoan = new HomeLoan("hrithik",22,8,4);
		PersonalLoan pLoan = new PersonalLoan("Raju",24,6,19);
		
		System.out.println(hLoan.getHomeLoan());
		System.out.println(pLoan.getPersonalLoan());

	}

}
