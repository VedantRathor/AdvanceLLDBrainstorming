package lld.VendingMachine;

import lld.VendingMachine.Enums.Coin;
import lld.VendingMachine.Item.Item;
import lld.VendingMachine.VendingMachineState.IdleState;
import lld.VendingMachine.VendingMachineState.VendingMachineState;

import java.util.List;

public class VendingMachine {
    private VendingMachineState vendingMachineState;
    private List<Coin> coinList;

    private final VendingMachineInventory vendingMachineInventory;

    public VendingMachine() {
        vendingMachineInventory = VendingMachineInventory.getVendingMachineInventory();
        vendingMachineState = new IdleState(this);
    }

    public VendingMachineState getVendingMachineState() {
        return vendingMachineState;
    }

    public void setVendingMachineState(VendingMachineState vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }

    public List<Coin> getCoinList() {
        return coinList;
    }

    public void setCoinList(List<Coin> coinList) {
        this.coinList = coinList;
    }

    public void addCoin(Coin coin) {
        this.coinList.add(coin);
    }

    public int getTotalAmount() {
        int totalAmount = 0;

        for (Coin coin: this.coinList) {
            totalAmount += coin.getValue();
        }

        return (totalAmount);
    }

    public Item getProductItem(int productCode) {
        return vendingMachineInventory.getProductItem(productCode);
    }

    public void updateProduct(int productCode) {
        vendingMachineInventory.updateProduct(productCode);
    }

    public void addItem(Item item) {
        this.vendingMachineInventory.addItem(item);
    }

    public void displayAllItems() {
        this.vendingMachineInventory.displayAllItems();
    }
}
