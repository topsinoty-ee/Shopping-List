package com.topsinoty;

import java.util.Scanner;


public class Main {
    public Scanner scanner = new Scanner(System.in);
    ItemHandler items = new ItemHandler();


    public static void main(String[] args) {
        Main main = new Main();
        boolean hasMoreItems = false;
        do {
            main.getItem();

            System.out.print("Do you want to keep browsing? (y/n): ");
            String yesOrNo = main.scanner.next().toLowerCase();

            if (yesOrNo.equals("yes") || yesOrNo.equals("y")) {
                hasMoreItems = true;
            } else if (yesOrNo.equals("no") || yesOrNo.equals("n")) {
                //showItems

                main.getValueFromArray();
//                System.out.println(main.items.itemNames);
//                System.out.println(main.items.itemCosts);
//                System.out.println(main.items.numberOfItems);
                break;
            }
        } while (hasMoreItems);
    }

    public void getItem() {
        //Post values into respective arrays

        System.out.print("Bought item: ");
        String itemName = scanner.next().toLowerCase();
        items.itemName(itemName);

        System.out.print("How many: ");
        int itemQuantity = scanner.nextInt();
        items.itemQuantity(itemQuantity);

        System.out.print("How much: £");
        float itemCost = scanner.nextFloat();
        items.itemCost(itemCost);

//            System.out.println(items.itemNames);
//            System.out.println(items.itemCosts);
//            System.out.println(items.numberOfItems);

    }

    public void getValueFromArray() {
        for (int i = 0; i < items.itemNames.toArray().length; i++) {
            String result = items.showItem(items.itemNames.get(i), items.itemCosts.get(i), items.numberOfItems.get(i));
            System.out.println("You have bought " + result);
        }
        System.out.print("Total costs: "+items.getTotalCosts(items.multipliedItemCosts));
    }
}