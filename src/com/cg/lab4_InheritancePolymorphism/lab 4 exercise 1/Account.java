package tushar;

import java.util.Random;

public class Account {
	Random rand=new Random();
	private long accNum;
	private double balance;
	private Person accHolder;
	
	Account(){
		
	}
	
	Account(String name,float age,double balance){
		setAccHolder(new Person(name,age));
		this.balance=balance;
	}
	
	public void deposit(double depAmount) {
		balance=balance+depAmount;
		
	}
     public void withdraw(double withdrawAmt) {
		balance=balance-withdrawAmt;
	}
	
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
