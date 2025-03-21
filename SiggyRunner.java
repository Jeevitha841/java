class SwiggyRunner{
	public static void main(String foodDelivery[]){
	double price = Swiggy.takeOrder("Dosa");
		System.out.println(price);
	double priceWithQuantity = Swiggy.takeOrder("Dosa", 7);
		System.out.println(priceWithQuantity);
		
	}
}