class Fourseason{
	static String menus[]={"Gammon steak with fried egg or pineapple","Chicken Kiev","Ham and 2 eggs","Ham and 2 eggs","Breaded scampi","Poached Salmon fillet ","Prawn salad  ","south meals","north meals","Chilli con carne "};
	public static void main(String hotel[]){
		//String menus[]={"Gammon steak with fried egg or pineapple","Chicken Kiev","Ham and 2 eggs","Ham and 2 eggs","Breaded scampi","Poached Salmon fillet ","Prawn salad  ","south meals","north meals","Chilli con carne "};
		//System.out.println("the total no of food added are:" +menus.length);
		//System.out.println("the foods avaliable are :"+menus[0]+","+menus[1]+","+menus[2]+","+menus[3]+","+menus[4]+","+menus[5]+","+menus[6]+","+menus[7]+","+menus[8]+","+menus[9]+".");
	System.out.println("main started");
		getMenu();
	System.out.println("main ended");
	}
	public static void getMenu(){
	System.out.println("inside getMenu()");
	System.out.println("Menu:");
		for(String cont:menus){
			System.out.println(cont);
		}
		System.out.println("end getMenu()");
	}
}