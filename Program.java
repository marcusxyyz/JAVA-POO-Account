package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account acc = new Account();
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit(y/n)? ");
		char condition = sc.next().toLowerCase().charAt(0);
	
		if (condition == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			acc = new Account(number, holder, initialDeposit);
		}
		else {
			acc = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(acc);
		
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		acc.depositValue(deposit);
		System.out.println("Updated account data:");
		System.out.println(acc);
		
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		acc.withdrawValue(withdraw);
		System.out.println("Updated account data:");
		System.out.println(acc);
		
		sc.close();
	}

}
