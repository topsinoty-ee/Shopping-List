package com.topsinoty;

import java.util.Scanner;

public class Main {
    public Scanner scanner = new Scanner(System.in);
    BrowsingItems items = new BrowsingItems();

    public static void main(String[] args) {
        Main main = new Main();
        main.getItem();
    }

    public void getItem() {
        System.out.print("Bought item: ");
        String itemName = scanner.next().toLowerCase();
        System.out.print("How many: ");
        int itemQuantity = scanner.nextInt();
        System.out.print("How much: $");
        float itemCost = scanner.nextFloat();

        System.out.println(items.showItem(itemName, itemCost, itemQuantity));
    }
}