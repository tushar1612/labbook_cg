package tushar;
public class AccountMain {
	Account customers[]=new Account[2];
	public static void main(String[] args) {
		Account acc1=new Account("Smith",25,2000);
		Account acc2=new Account("Kalthy",23,3000);
		acc1.deposit(2000);
		acc2.withdraw(2000);
		System.out.println("Updated balance in Smith Account "+acc1.getBalance());
		System.out.println("Updated balance in Smith Account "+acc2.getBalance());
		 System.out.println();
		 
		Account acc3=new SavingAccount("Smith",25,2000);
		Account acc4=new SavingAccount("Kalthy",23,3000);
		acc3.deposit(2000);
		acc4.withdraw(3000);
		System.out.println("Updated balance in Smith Account "+acc3.getBalance());
		System.out.println("Updated balance in Smith Account "+acc4.getBalance());
		 System.out.println();
		
		Account acc5=new CurrentAccount("Smith",25,2000);
		Account acc6=new CurrentAccount("Kalthy",23,3000);
		acc5.deposit(3000);
		acc6.withdraw(4000);
		System.out.println("Updated balance in Smith Account "+acc5.getBalance());
		System.out.println("Updated balance in Smith Account "+acc6.getBalance());
		 System.out.println();
		
	}
}