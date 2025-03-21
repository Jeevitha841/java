class Swiggy{
	public static double takeOrder(String product){
		 double price=0;
		 if(product=="Dosa"){
			 price=80;
			 return price;
		 }
		 else
			 System.out.println("product not found");
		 return price;
	}
	public static double takeOrder(String product,int quantity){
		 double price=0;
		 if(product=="Dosa"){
			 price=80*quantity;
			 return price;
		 }
		 else
			 System.out.println("product not found");
		  return price;
	}
	
}