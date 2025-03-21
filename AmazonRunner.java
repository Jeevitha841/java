class AmazonRunner{
	public static void main(String ama[]){
		Amazon ref=new Amazon();
		 ref.id=1;
		 ref.yourName="Jeev";
		 ref.phoneNumber=9900112222l;
		 ref.password="jeV3";
		 System.out.println("id is "+ref.id);
		 System.out.println("phone number is "+ref.phoneNumber);
		 System.out.println("name is "+ref.yourName);
		 System.out.println("password is "+ref.password);
		 
		 ref.id=2;
		 ref.yourName="akan";
		 ref.phoneNumber=8899776655l;
		 ref.password="Gty34";
		 System.out.println("id is "+ref.id);
		 System.out.println("phone number is "+ref.phoneNumber);
		 System.out.println("name is "+ref.yourName);
		 System.out.println("password is "+ref.password);
	}
}