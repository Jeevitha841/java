class FoodPandaaRunner{
	public static void main(String foodDelivery[]){
	double price = FoodPandaa.takeOrder("Chicken kundapuri curry");
		System.out.println(price);
	double priceWithQuantity = FoodPandaa.takeOrder("Chicken kundapuri curry",5);
		System.out.println(priceWithQuantity);
		
	}
}