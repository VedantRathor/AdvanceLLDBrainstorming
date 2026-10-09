package lld.VendingMachine;

import lld.VendingMachine.Enums.Coin;
import lld.VendingMachine.Item.Item;
import lld.VendingMachine.VendingMachineState.VendingMachineState;

public class Main {
    public static void main(String[] varargs) {
        System.out.println("Vending Machine....");

        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.addItem(new Item(101, "Coke", 100));
        vendingMachine.addItem(new Item(102, "Bread", 70));
        vendingMachine.addItem(new Item(103, "Pepsi", 50));
        vendingMachine.addItem(new Item(104, "Chips", 40));
        vendingMachine.addItem(new Item(105, "ColdDrink", 80));
        vendingMachine.addItem(new Item(106, "Wafer", 70));
        vendingMachine.addItem(new Item(107, "Nuggets", 120));
        vendingMachine.addItem(new Item(108, "Eclairs", 10));

        System.out.println("Displaying all product items");
        vendingMachine.displayAllItems();

        VendingMachineState state = vendingMachine.getVendingMachineState();
        state.onPressInsertCoinButton(vendingMachine);

        state = vendingMachine.getVendingMachineState();
        state.insertingCoin(Coin.NICKLE, vendingMachine);
        state.insertingCoin(Coin.NICKLE, vendingMachine);
        state.insertingCoin(Coin.DIME, vendingMachine);
        state.onPressSelectProductButton(vendingMachine);

        state = vendingMachine.getVendingMachineState();
        state.chooseProduct(107, vendingMachine);

        System.out.println("Displaying all product items");
        vendingMachine.displayAllItems();
    }
}
