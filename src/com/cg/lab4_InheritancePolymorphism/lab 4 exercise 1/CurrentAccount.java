package tushar;

import java.util.*;

public class CurrentAccount extends Account{
	void Account(){
	}
	Random rand=new Random();
	private double overdraftLimit=-500;
	@Override
	public void withdraw(double withdrawAmt) {
		double balance=getBalance();
		double temp=balance-withdrawAmt;
		if(temp>overdraftLimit) {
			System.out.println("True");
		}
			else
		{
			System.out.println("False");
		}
	}
	public CurrentAccount(String name,float age,double balance) {
		setAccHolder(new Person(name,age));
		setAccNum(rand.nextLong());
		setBalance(balance);
	}
	
}
