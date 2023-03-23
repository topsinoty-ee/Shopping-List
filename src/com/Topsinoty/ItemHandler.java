package com.topsinoty;


import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class ItemHandler {
    public List<String> itemNames = new ArrayList<>();
    public List<Integer> numberOfItems = new ArrayList<>();
    public List<Float> itemCosts = new ArrayList<>();
    public List<Float> multipliedItemCosts = new ArrayList<>();

    public String showItem(String itemName, float itemCost, int itemQuantity) {
        float result = itemCost * (float) itemQuantity;
        multipliedItemCosts(result);
        return "You have bought [" + itemName.toUpperCase() + " x" + itemQuantity + "] (" + NumberFormat.getCurrencyInstance().format(result) + ")";
    }

    public String getTotalCosts(List<Float> totalCosts) {
        float total = 0;
        for (Float d : totalCosts)
            total += d;
        return NumberFormat.getCurrencyInstance().format(total);
    }

    public void itemName(String newItem) {
        itemNames.add(newItem);
    }

    public void itemCost(float itemCost) {
        itemCosts.add(itemCost);
    }

    public void itemQuantity(int quantity) {
        numberOfItems.add(quantity);
    }
    public void multipliedItemCosts(float multiplied){
        multipliedItemCosts.add(multiplied);
    }
}
