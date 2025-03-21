class Dmart{
	static String alcohols[]={"jack daniels","ballentine","absolutevodka","bacardi","magicmoments","100pipers"};
	static String vegetables[]={"cucumber","betroot","raddish","carrot","tomato"};
	static String snacks[]={"bingo","madangles","snikers","dairymilk","lays"};
 public static void main(String alo[]){
 //String alcohols[]={"jack daniels","ballentine","absolutevodka","bacardi","magicmoments","100pipers"};
 //System.out.println("total number of alcohols avaiable "+ alcohols.length);
 //System.out.println("alcohols avaiable are :"+alcohols[0]+" ,"+alcohols[1]+" ,"+alcohols[2]+" ,"+alcohols[3]+" ,"+alcohols[4]+" ,"+alcohols[5]);
 
 //String vegetables[]={"cucumber","betroot","raddish","carrot","tomato"};
  //System.out.println("total number of vegetables avaiable "+ vegetables.length);
  //System.out.println("vegetables avaiable are :"+vegetables[0]+" ,"+vegetables[1]+" ,"+vegetables[2]+" ,"+vegetables[3]+" ,"+vegetables[4]);
 
  //String snacks[]={"bingo","madangles","snikers","dairymilk","lays"};
//System.out.println("total no of snacks added:" + snacks.length);
	//System.out.println("snacks avaliable are:" + snacks[0] +"," + snacks[1]+"," +snacks[2]+ ","+snacks[3]+ ","+snacks[4]);
	System.out.println("main started");
		getDmart();
	System.out.println("main ended");
	}
	public static void getDmart(){
	System.out.println("inside getDmart()");
	System.out.println("List of alcohol:");
	for(String alcohol:alcohols){
	 System.out.println(alcohol);
	}
	System.out.println("List of vegetables:");
	for(String vegiees:vegetables){
	   System.out.println(vegiees);
	}
  System.out.println("List of snacks:");
	for(String snacky:snacks){
	   System.out.println(snacky);
	}
	System.out.println("end getDmart()");
 }
}    