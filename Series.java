class Series{
	static String hindiSeries[]={"Dabba Cartel","Ziddi Girls","Panchayat","Asur","Special Ops","Shark Tank India ","Delhi Crime","The Night Manager","Farzi","Crime Beat"};
	static String malayalamSeries[]={"Jai Mahendran","Masterpeace","Menaka Rock Paper Scissors","Amma Makal","Just Married Things","Meenaviyal", "Perilloor Premier League","Something Something like Love","soul stories","nishabdam"};
	static String englishSeries[]={"Gossip Girls","Ginny and Gerogia","Gotham","Sons of Anarchy","Sherlock","lost","outlander","loki","Lady Jaane","Stanger Things"};
	public static void main(String series[]){
	//String hindiSeries[]={"Dabba Cartel","Ziddi Girls","Panchayat","Asur","Special Ops","Shark Tank India ","Delhi Crime","The Night Manager","Farzi","Crime Beat"};
	//String malayalamSeries[]={"Jai Mahendran","Masterpeace","Menaka Rock Paper Scissors","Amma Makal","Just Married Things","Meenaviyal", "Perilloor Premier League","Something Something like Love","soul stories","nishabdam"};
	//String englishSeries[]={"Gossip Girls","Ginny and Gerogia","Gotham","Sons of Anarchy","Sherlock","lost","outlander","loki","Lady Jaane","Stanger Things"};
	//System.out.println("the hindiSeries avaliable are:"+hindiSeries[0]+","+hindiSeries[1]+","+hindiSeries[2]+","+hindiSeries[3]+","+hindiSeries[4]+","+hindiSeries[5]+","+hindiSeries[6]+","+hindiSeries[7]+","+hindiSeries[8]+","+hindiSeries[9]+".");
	//System.out.println("the malayalamSeries avaliable are:"+malayalamSeries[0]+","+malayalamSeries[1]+","+malayalamSeries[2]+","+malayalamSeries[3]+","+malayalamSeries[4]+","+malayalamSeries[5]+","+malayalamSeries[6]+","+malayalamSeries[7]+","+malayalamSeries[8]+","+malayalamSeries[9]+".");
	//System.out.println("the englishSeries avaliable are:"+englishSeries[0]+","+englishSeries[1]+","+englishSeries[2]+","+englishSeries[3]+","+englishSeries[4]+","+englishSeries[5]+","+englishSeries[6]+","+englishSeries[7]+","+englishSeries[8]+","+englishSeries[9]+".");
	System.out.println("main started");
		getSeries();
	System.out.println("main ended");
	}
	public static void getSeries(){
	System.out.println("inside getMart()");
	System.out.println("List of hindiSeries are:");
		for(String hs:hindiSeries){
			System.out.println(hs);
		}
	System.out.println("List of malayalamSeries are:");
		for(String ms:malayalamSeries){
			System.out.println(ms);
		}
	System.out.println("List of englishSeries are:");
	for(String es:englishSeries){
	   System.out.println(es);
	}
	System.out.println("end getSeries()");
	}
	
}