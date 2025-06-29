package lokesh_Spring_5_AOC.service;

import org.springframework.stereotype.Component;

@Component
public class Account {
	private double balance;

	public Account() {
		super();
		this.balance = 0.0;
	}
	
	public Account(double balance) {
		super();
		this.balance = balance;
	}
	
	public void withdrawBalance() {
		// this.balance = balance-amount;
		System.out.println("Amount WithDraw...");
	}
	
	public void deposite() {
		// this.balance = balance+amount;
		System.out.println("Amount Deposited...");
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [balance=" + balance + "]";
	}
	
	
}
