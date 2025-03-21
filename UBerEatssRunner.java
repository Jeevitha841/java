class UberEatssRunner{
	public static void main(String foodDelivery[]){
	double price = UberEatss.takeOrder("Peri Peri Chicken Wings");
		System.out.println(price);
	double priceWithQuantity = UberEatss.takeOrder("Peri Peri Chicken Wings",2);
		System.out.println(priceWithQuantity);
		
	}
}