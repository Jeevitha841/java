class UberEatss{
	public static double takeOrder(String product){
        double price=0;
        if(product=="Peri Peri Chicken Wings"){
           price=299;
            return price;
        }
		else
			 System.out.println("product not found");
		 return price;
	}
	public static double takeOrder(String product,int quantity){
		 double price=0;
		 if(product=="Peri Peri Chicken Wings"){
			 price=299*quantity;
			 return price;
		 }
		 else
			 System.out.println("product not found");
		  return price;
	}
}