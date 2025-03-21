class Pincode{
	static int pincodes[]={560022,562218,577101,567711};
	public static void main(String gg[]){
		//int pincodes[]={560022,562218,577101,567711};
		System.out.println("main started");
		getPincode();
		System.out.println("main ended");
	}
	public static void getPincode(){
		System.out.println("inside getPincode()");
		System.out.println("List of area pincode are:");
		for(int pincode:pincodes){
			System.out.println(pincode);
		}
		System.out.println("end getPincode()");
	}
	
} 