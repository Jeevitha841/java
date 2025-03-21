class BlinkIttRunner{
	public static void main(String foodDelivery[]){
	double price = Dominoss.takeOrder("Farmhouse");
		System.out.println(price);
	double priceWithQuantity = Dominoss.takeOrder("Farmhouse",5);
		System.out.println(priceWithQuantity);
		
	}
}