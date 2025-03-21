class Dominoss {
    public static int takeOrder(String productName) {
        int price = 0;
        
        if (productName == "Farmhouse") {  
            price = 199;
            return price;
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