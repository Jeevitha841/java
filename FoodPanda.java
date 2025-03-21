class FoodPanda {
   
    public static int takeOrder(String foodName) {
        int price = 0;
  
        if ( foodName== "Chicken kundapuri curry") {  
            price = 459;
            return price;
        } 
        else if (foodName == "Chicken Ghee Roast") {
            price = 199;
            return price;
		}
		else if (foodName == "Chicken  karavali curry") {
            price = 319;
            return price;
		}
		else if (foodName == "chicken sukka") {
            price = 359;
            return price;
		}
		else if (foodName == "Prawn ghee roast") {
            price = 319;
            return price;
		}
		else if (foodName == "Chicken pulimunchi curry") {
            price = 319;
            return price;
		}
		else if (foodName == "Chicken tawa") {
            price = 369;
            return price;
		}
		else if (foodName == "crab ghee roast") {
            price = 399;
            return price;
		}
		else if (foodName == "bangada fish  curry") {
            price = 269;
            return price;
		}
		else if (foodName == "crab sukka") {
            price = 449;
            return price;
		}
		else if (foodName == "squid ghee roast") {
            price = 449;
            return price;
		}
		else if (foodName == "prawn butter garlic") {
            price = 449;
            return price;
		}
		else if (foodName == "paneer ghee roast") {
            price = 369;
            return price;
		}
		else if (foodName == "anjal uppumunchi") {
            price = 599;
            return price;
		}
		else if (foodName == "chicken butter garlic") {
            price = 359;
            return price;
		}
		else if (foodName == "anjal masala  fry") {
            price = 599;
            return price;
		}
		else if (foodName == "bangada tawa fry") {
            price = 249;
            return price;
		}
		else if (foodName == "anjal rawa fry") {
            price = 549;
            return price;
		}
		else if (foodName == "manji fish fry") {
            price = 549;
            return price;
		}
		else if (foodName == "spicy crab") {
            price = 269;
            return price;
		}
		else if (foodName == "anjal garlic tawa fry") {
            price = 549;
            return price;
		}
		else if (foodName == "bangada garlic tawa fry") {
            price = 249;
            return price;
		}
		else if (foodName == "bangada uppumunchi") {
            price = 259;
            return price;
		}
		else if (foodName == "bhuthai fish fry") {
            price = 249;
            return price;
		}
		else if (foodName == "bolanjer fish fry") {
            price = 359;
            return price;
		}
		else if (foodName == "crab sukha") {
            price = 449;
            return price;
		}
		else if (foodName == "kane fish fry") {
            price = 449;
            return price;
		}
		else if (foodName == "manji fish fry") {
            price = 549;
            return price;
		}
		else if (foodName == "marwai sukka") {
            price = 449;
            return price;
		}
		else if (foodName == "squid pepper fry") {
            price = 449;
            return price;
		}
		else if (foodName == "squid rawa fry") {
            price = 449;
            return price;
		}
		else if (foodName == "chicken urval") {
            price = 349;
            return price;
		}
		else if (foodName == "mutton sukka") {
            price = 450;
            return price;
		}
		else if (foodName == "mutton pepper dry ") {
            price = 549;
            return price;
		}
		else if (foodName == "anjal pulimunchi") {
            price = 549;
            return price;
		}
		else {
            System.out.println("Food name not found");
        }
        
        return price; 
	}	
	
}