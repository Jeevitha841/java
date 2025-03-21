class ZeptooRunner{
	public static void main(String foodDelivery[]){
	double price = Zeptoo.takeOrder("Vietnamese Cold Coffee");
		System.out.println(price);
	double priceWithQuantity = Zeptoo.takeOrder("Vietnamese Cold Coffee",5);
		System.out.println(priceWithQuantity);
		
	}
}