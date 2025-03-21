class Sbi{
	public static String registration(String accountno,String cifno,String branchCode,String country ,String mobileNumber){
			  String reg=null;
	  boolean UserValid=validateUserAcc(accountno,cifno,branchCode,country,mobileNumber);
	  if(UserValid==true){
		  reg="registration succesfull";
	  }
	  else{
		  reg="registration unsuccesfull,please try again later";
	  }
	  return reg;
	 } 
	  public static boolean validateUserAcc(String accountno,String cifno,String branchCode,String country ,String mobileNumber){
		  boolean acc=false;
	 boolean isAccNoValid=false;
	 boolean isCIFnoValid=false;
	 boolean isBranchCodeValid=false;
	 boolean isCountryValid=false;
	 boolean isMobilenumberValid=false;
	 if(accountno!=null && accountno.length()>0 && accountno.length()==13){
		 isAccNoValid=true;
	 }
	 else{
		 System.out.println("Account Number is invalid.Please enter valid Account number ");
	 }
	 if(cifno!=null && cifno.length()>0 && cifno.length()==11){
		 isCIFnoValid=true;
	 }
	 else{
		 System.out.println("CIF Number is invalid.Please enter valid CIF number ");
	 }
	 if(branchCode!=null && branchCode.length()>0 && branchCode.length()==11){
		 isBranchCodeValid=true;
	 }
	 else{
		 System.out.println("Branch Name is invalid.Please enter valid Branch Name ");
	 }
	 if(country!=null && country=="INDIA" || country=="india"){
		 isCountryValid=true;
	 }
	 else{
		 System.out.println("Country NAme is invalid.Please enter valid Country name.Note:either Use all captial alphabets or small alphabets ");
	 }
	 if(mobileNumber!=null && mobileNumber.length()>0 && mobileNumber.length()==10){
		 isMobilenumberValid=true;
	 }
	 else{
		 System.out.println("Mobile Number is invalid.Please enter valid Mobile number ");
	 }
	 if(isAccNoValid==true && isBranchCodeValid==true && isCIFnoValid==true && isCountryValid==true && isMobilenumberValid==true){
		 acc=true;
	 }
	 return acc;
	  }
}