class OlaFoodRunner{
	public static void main(String foodDelivery[]){
	double price = Swiggy.takeOrder("Mutton Seekh Kebab");
		System.out.println(price);
	double priceWithQuantity = Swiggy.takeOrder("Mutton Seekh Kebab", 5);
		System.out.println(priceWithQuantity);
		
	}
}