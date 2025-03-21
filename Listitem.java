class Listitem{
	static String item[]={ "Laptop", "Mobile", "Tablet", "Smartwatch", "Headphones", "Keyboard", "Mouse", "Monitor","Printer", "Scanner", "Chair", "Table", "Lamp", "Fan", "Sofa", "Bed", "Pillow", "Blanket","Cup", "Plate", "Bottle", "Shoes", "Shirt", "Jeans", "Jacket", "Bag", "Notebook", "Pen","Pencil", "Eraser", "Charger", "Adapter", "USB Cable", "Speaker", "Television", "Projector","Calculator", "Clock", "Mirror", "Curtain"};
	public static void main(String code[]){
	//String item[]={ "Laptop", "Mobile", "Tablet", "Smartwatch", "Headphones", "Keyboard", "Mouse", "Monitor","Printer", "Scanner", "Chair", "Table", "Lamp", "Fan", "Sofa", "Bed", "Pillow", "Blanket","Cup", "Plate", "Bottle", "Shoes", "Shirt", "Jeans", "Jacket", "Bag", "Notebook", "Pen","Pencil", "Eraser", "Charger", "Adapter", "USB Cable", "Speaker", "Television", "Projector","Calculator", "Clock", "Mirror", "Curtain"};
		//System.out.println("the total no of item are:" +item.length);
		
		System.out.println("main started");
		getItem();
		System.out.println("main ended");
	}
	public static void getItem(){
		System.out.println("inside getItem()");
		System.out.println("List of item are:");
		for(String items:item){
			System.out.println(items);
		}
		System.out.println("end getItem()");
	}
}