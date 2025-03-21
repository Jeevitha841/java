class MaxFashion{
 public static String signUp(String firstName ,String lastName,String phoneNumber,String dob,String emailID,String gender){
	  String ref=null;
	  boolean UserValid=validateUserProf(firstName,lastName,phoneNumber,dob,emailID,gender);
	  if(UserValid==true){
		  ref="registration succesfull";
		  ref="registration unsuccesfull,please try again later";
	  }
	  return ref;
	 }
	 
 public static boolean validateUserProf(String firstName ,String lastName,String phoneNumber,String dob,String emailID,String gender){
	 boolean value=false;
	 boolean isFirstNameValid=false;
	 boolean isLastNameValid=false;
	 boolean isPhoneNumberValid=false;
	 boolean isDOBValid=false;
	 boolean isEmailIdValid=false;
	 boolean isGendervalid=false;
	 
	 if(firstName!=null  && firstName.length()>=3){
		 isFirstNameValid=true;
	 }
	 else{
		 System.out.println("First Name is invalid.Please enter valid First name ");
	 }
	 if(lastName!=null && lastName.length()>=1){
		 isLastNameValid=true;
	 }
	 else{
		 System.out.println("Last Name is invalid.Please enter valid Last name ");
	 }
	 if(phoneNumber!=null && phoneNumber.length()>0 && phoneNumber.length()==10){
		 isPhoneNumberValid=true;
	 }
	 else{
		 System.out.println("Phone Number is invalid.Please enter valid Phone number ");
	 }
	 if(dob!=null){
		 isDOBValid=true;
	 }
	 else{
		 System.out.println("DOB is invalid.Please enter valid DOB ");
	 }
	 if(emailID!=null){
		 isEmailIdValid=true;
	 }
	 else{
		 System.out.println("email is invalid.Please enter valid emailID ");
	 }
	 if(gender!=null){
		 isGendervalid=true;
	 }
	 else{
		 System.out.println("gender is invalid.Please enter valid gender");
	 }
	 if(isFirstNameValid == true && isLastNameValid== true && isPhoneNumberValid==true && isDOBValid==true && isEmailIdValid==true && isGendervalid==true){
		 value = true;
	 }
	 return value;
	}
	
	
}