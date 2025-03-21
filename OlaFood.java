public class OlaFoods {
    public static int range(String prod){
        int price=0;
        if(prod=="Mutton Seekh Kebab"){
            price=400;
            return price;
        }
		 else
			 System.out.println("product not found");
		 return price;
	}
	public static double takeOrder(String product,int quantity){
		 double price=0;
		 if(product=="Mutton Seekh Kebab"){
			 price=400*quantity;
			 return price;
		 }
		 else
			 System.out.println("product not found");
		  return price;
	}
}