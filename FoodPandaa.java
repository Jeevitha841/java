class FoodPandaa {
   
    public static int takeOrder(String foodName) {
        int price = 0;
  
        if ( foodName== "Chicken kundapuri curry") {  
            price = 459;
            return price;
        } 
		else
			 System.out.println("product not found");
		 return price;
	}
	public static double takeOrder(String product,int quantity){
		 double price=0;
		 if(product=="Chicken kundapuri curry"){
			 price=199*quantity;
			 return price;
		 }
		 else
			 System.out.println("product not found");
		  return price;
	}
}