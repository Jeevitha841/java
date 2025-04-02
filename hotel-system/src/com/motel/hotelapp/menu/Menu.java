package com.motel.hotelapp.menu;

public class Menu {

    public int itemId ;
    public String itemName ;
    public String[] ingridients;
    public double itemPrice ;

    public void menuDetails(){
        System.out.println("\nMotel Menu:-");
        System.out.println("\nItem Id: "+this.itemId);
        System.out.println("Item Name: "+this.itemName);
        for(String ingridient : ingridients){
            System.out.println(ingridient);
        }
        System.out.println("Item Price: Rs."+this.itemPrice);
    }
}


