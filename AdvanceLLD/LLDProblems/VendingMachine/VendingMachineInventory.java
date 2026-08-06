package VendingMachine;

import VendingMachine.Item.Item;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineInventory {
    private List<Item> itemList;
    private static final VendingMachineInventory vendingMachineInventory = new VendingMachineInventory();

    private VendingMachineInventory() {
        this.itemList = new ArrayList<>();
    }

    public static VendingMachineInventory getVendingMachineInventory() {
        return vendingMachineInventory;
    }

    public List<Item> getAllItems() {
        return this.itemList;
    }

    public void displayAllItems() {
        for (Item item: this.itemList) {
            System.out.println("Item name: " + item.getName() + ", Item price: " + item.getPrice());
        }
    }

    public void addItem(Item item) {
        this.itemList.add(item);
    }

    public void removeItem(Item item) {
        this.itemList.remove(item);
    }

    public Item getProductItem(int productCode) {
        for (Item item: this.itemList) {
            if (item.getId() == productCode) { return item; }
        }

        return null;
    }

    public void updateProduct(int productCode) {
        Item item = this.getProductItem(productCode);
        this.itemList.remove(item);
    }
}
