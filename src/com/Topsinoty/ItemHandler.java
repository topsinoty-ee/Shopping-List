package com.topsinoty;


import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class ItemHandler {
    public List<String> itemNames = new ArrayList<>();
    public List<Integer> numberOfItems=new ArrayList<>();
    public List<Float> itemCosts=new ArrayList<>();

    public String showItem(String itemName, float itemCost, int itemQuantity) {
        float result = itemCost * (float) itemQuantity;
        return "You have bought [" + itemName.toUpperCase() + " x" + itemQuantity + "] (" + NumberFormat.getCurrencyInstance().format(result) + ")";
    }

    public List<String> itemName(String newItem) {
        itemNames.add(newItem);
        return itemNames;
    }
    public List<Integer> itemQuantity(int quantity) {
        numberOfItems.add(quantity);
        return numberOfItems;
    }
    public List<Float> itemCost(float itemCost){
        itemCosts.add(itemCost);
        return itemCosts;
    }
}
