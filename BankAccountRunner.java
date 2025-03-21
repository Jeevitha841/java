class BankAccountRunner{
	public static void main(String []args){
		System.out.println("main started");
		BankAccount.credit(2000);
		BankAccount.debit(1000);
		BankAccount.getBalance();
		BankAccount.credit(9543);
		BankAccount.getBalance();
		BankAccount.debit(10000);
		BankAccount.debit(700);
		BankAccount.getBalance();
		BankAccount.credit(-0.0);
		System.out.println("main ended");
	}
}