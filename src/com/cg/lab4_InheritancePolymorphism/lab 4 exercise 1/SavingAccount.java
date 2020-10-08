package tushar;

import java.util.Random;

public class SavingAccount extends Account{
	void Account(){
	}
	Random rand=new Random();
	final double minBalance=500;
	@Override
	public void withdraw(double withdrawAmt) {
		double balance=getBalance();
		double temp=balance-withdrawAmt;
			 if(temp>minBalance) {
				 super.withdraw(withdrawAmt);
			 }
			 else {
				 System.out.println("Transaction is Cancelled, 500 Minimum Balance is Needed!");
				
			 }
		
	}
	public SavingAccount(String name,float age,double balance) {
		setAccHolder(new Person(name,age));
		setAccNum(rand.nextLong());
		setBalance(balance);
	}
	
	

}
