class SuperMart{
	static String groceries[]={"Rice", "Wheat", "Sugar", "Salt", "Milk", "Butter", "Cheese", "Eggs", "Flour", "Oil"};
	static String perfumes[] ={"Chanel", "Dior", "Gucci", "Armani", "Calvin Klein", "Versace", "Burberry", "Tom Ford", "Hugo Boss", "YSL"};
	static String biscuit[]={"Oreo", "Bourbon", "Hide & Seek", "Good Day", "Parle-G", "Marie", "Monaco", "Little Debbie", "Jim Jam", "Digestive"};
	static String vegetables[]={"Tomato", "Potato", "Onion", "Carrot", "Broccoli", "Spinach", "Capsicum", "Cabbage", "Cucumber", "Garlic"};
	static String utensils[]={"Oreo", "Bourbon", "Hide & Seek", "Good Day", "Parle-G", "Marie", "Monaco", "Little Debbie", "Jim Jam", "Digestive"};
	public static void main(String code[]){
		//System.out.println("the groceries avaliable are :"+groceries[0]+","+groceries[1]+","+groceries[2]+","+groceries[3]+","+groceries[4]+","+groceries[5]+","+groceries[6]+","+groceries[7]+","+groceries[8]+","+groceries[9]+".");
		//System.out.println("the perfumes avaliable are :"+perfumes[0]+","+perfumes[1]+","+perfumes[2]+","+perfumes[3]+","+perfumes[4]+","+perfumes[5]+","+perfumes[6]+","+perfumes[7]+","+perfumes[8]+","+perfumes[9]+".");	
	//String biscuit[]={"Oreo", "Bourbon", "Hide & Seek", "Good Day", "Parle-G", "Marie", "Monaco", "Little Debbie", "Jim Jam", "Digestive"};
		//System.out.println("the biscuit avaliable are :"+biscuit[0]+","+biscuit[1]+","+biscuit[2]+","+biscuit[3]+","+biscuit[4]+","+biscuit[5]+","+biscuit[6]+","+biscuit[7]+","+biscuit[8]+","+biscuit[9]+".");
	//String vegetables[]={"Tomato", "Potato", "Onion", "Carrot", "Broccoli", "Spinach", "Capsicum", "Cabbage", "Cucumber", "Garlic"};
		//System.out.println("vegetables avaiable are :"+vegetables[0]+" ,"+vegetables[1]+" ,"+vegetables[2]+" ,"+vegetables[3]+" ,"+vegetables[4]+" ,"+vegetables[5]+" ,"+vegetables[6]+" ,"+vegetables[7]+" ,"+vegetables[8]+" ,"+vegetables[9]+" .");
//	String utensils[]={"Oreo", "Bourbon", "Hide & Seek", "Good Day", "Parle-G", "Marie", "Monaco", "Little Debbie", "Jim Jam", "Digestive"};
		//System.out.println("the utensils avaliable are :"+utensils[0]+","+utensils[1]+","+utensils[2]+","+utensils[3]+","+utensils[4]+","+utensils[5]+","+utensils[6]+","+utensils[7]+","+utensils[8]+","+utensils[9]+".");
		System.out.println("main started");
		getMart();
		System.out.println("main ended");
	}
	public static void getMart(){
		System.out.println("inside getMart()");
		System.out.println("List of groceries are:");
		for(String veg:groceries){
			System.out.println(veg);
		}
		System.out.println("List of perfumes are:");
		for(String fra:perfumes){
			System.out.println(fra);
		}
		System.out.println("List of biscuit are:");
		for(String bs:biscuit){
			System.out.println(bs);
		}
		System.out.println("List of vegetables are:");
		for(String vegiees:vegetables){
			System.out.println(vegiees);
		}
		System.out.println("List of utensils are:");
		for(String us:utensils){
			System.out.println(us);
		}
		System.out.println("end getMart()");
	}
}	