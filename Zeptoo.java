class Zeptoo{
	public static int takeOrder(String product){
	int price=0;
	if (product == "Vietnamese Cold Coffee"){
		price=239;
		return price;
	}
	else
			 System.out.println("product not found");
		 return price;
	}
	public static double takeOrder(String product,int quantity){
		 double price=0;
		 if(product=="Vietnamese Cold Coffee"){
			 price=199*quantity;
			 return price;
		 }
		 else
			 System.out.println("product not found");
		  return price;
	}
}