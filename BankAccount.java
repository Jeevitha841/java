class BankAccount{
	static double balanace;
	public static void credit(double amount){
		System.out.println("credit started");
		if(amount>0.0){
			balanace=balanace+amount;
			System.out.println(balanace);
		}
		else
			System.out.println("Invalid Amount");
		System.out.println("credit ended");
		
	
	}
	public static void debit(double amount){
		System.out.println("debit started");
		if(amount<=balanace){
			balanace=balanace-amount;
			System.out.println(balanace);
		}
		else
			System.out.println("Insufficient balanace");
		System.out.println("debit ended");
		
	}
	public static void getBalance(){
		System.out.println("Balance is "+'9
		balanace);
	}

}