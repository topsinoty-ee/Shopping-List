package com.topsinoty;

public class BrowsingItems {
    public String showItem(String itemName, float itemCost, int itemQuantity){
        return "You have bought "+itemName+" x"+itemQuantity+" ($"+itemCost*(float)itemQuantity+")";
    }
}
