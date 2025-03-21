class Dominos {
   
    public static int rate(String productName) {
        int price = 0;
        
        if (productName == " Peppy Panner") {  
            price = 299;
            return price;
        } 
        else if (productName == " Farmhouse") {
            price = 199;
            return price;
        } 
        else if (productName == "Veg Paradise") {
            price = 249;
            return price;
        }
		else if (productName == "Corn&Cheese"){
			price=299;
			return price;
		}
		else if (productName == "Margherita"){
			price=109;
			return price;
		}
		else if(productName == "Double Cheese Margherita"){
			price=209;
			return price;
		}
		else if(productName == "Indi Tandoori Paneer"){
			price=319;
			return price;
		}
		else if(productName == "Veg Extravaganza"){
			price=309;
			return price;
		}
		else if(productName == "Mexican Green Wave"){
			price=269;
			return price;
		}
		else if(productName == "Fresh Veggie"){
			price=219;
			return price;
		}
		else if(productName == "Corn&Cheese Paratha Pizza "){
			price=199;
			return price;
		}
		else if(productName == "Fiery Jalapeno&Paprika"){
			price=199;
			return price;
		}
		else if(productName == "Achari Do Pyaza"){
			price=199;
			return price;
		}
		else if(productName == "Cheese Overload"){
			price=379;
			return price;
		}
		else if(productName == "Blazing Onion&Paprika"){
			price=199;
			return price;
		}
		else if(productName == "Panner Spice Supreme"){
			price=299;
			return price;
		}
		else if(productName == "6in1Pizza"){
			price=799;
			return price;
		}
		else if(productName == "BBQ Chicken"){
			price=349;
			return price;
		}
		else if(productName == "Chicken Delight"){
			price=349;
			return price;
		}
		else if(productName == "Double Chicken"){
			price=349;
			return price;
		}
		else if(productName == "Blazing Chicken"){
			price=349;
			return price;
		}
		else if(productName == "Barbecue Chicken"){
			price=249;
			return price;
		}
		else if(productName == "Blazing Chicken&Paprika"){
			price=269;
			return price;
		}
		else if(productName == "Chicken Sausage"){
			price=209;
			return price;
		}
		else if(productName == "Spiced Double Chicken"){
			price=329;
			return price;
		}
		else if(productName == "Chicken Dominator"){
			price=369;
			return price;
		}
		else if(productName == "Chicken Keema Paratha Pizza"){
			price=249;
			return price;
		}
		else if(productName == "the 5 chicken Feast "){
			price=399;
			return price;
		}
		else if(productName == "Indi Chicken Thikka"){
			price=389;
			return price;
		}
		else if(productName == "Chicken Pepperoni"){
			price=379;
			return price;
		}
		else if(productName == "Chicken Fiesta"){
			price=339;
			return price;
		}
		else if(productName == "6in1ChickenPizza"){
			price=899;
			return price;
		}
		else if(productName == "Boneless Thighs"){
			price=149;
			return price;
		}
		
        else {
            System.out.println("Product name not found");
        }
        
        return price;  
	}
}