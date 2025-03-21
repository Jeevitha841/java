class Charr{
	static char letters[]={'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
	public static void main(String letter[]){
		//System.out.println("the letters avaliable are:"+letters[0]+","+letters[1]+","+letters[2]+","+letters[3]+","+letters[4]+","+letters[5]+","+letters[6]+","+letters[7]+","+letters[8]+","+letters[9]+".");
		System.out.println("main started");
		getLetter();
		System.out.println("main ended");
	}
	public static void getLetter(){
		System.out.println("inside getLetter()");
		System.out.println("List of Letters are:");
		for(char alpa:letters){
			System.out.println(alpa);
		}
		System.out.println("end getLetter()");
	}
} 