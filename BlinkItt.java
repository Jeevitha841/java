class BlinkItt {
    public static double getFoodPrice(String foodName) {
        double price = 0.0;

        if (foodName == "Vegetable Samosa") {
            price = 49.99;
        } 
	else
			 System.out.println("product not found");
		 return price;
	}
	public static double takeOrder(String product,int quantity){
		 double price=0;
		 if(product=="Farmhouse"){
			 price=199*quantity;
			 return price;
		 }
		 else
			 System.out.println("product not found");
		  return price;
	}
}