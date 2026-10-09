package lld.VendingMachine.VendingMachineState;

import lld.VendingMachine.Item.Item;
import lld.VendingMachine.VendingMachine;

public class SelectProductState extends VendingMachineState {
    public SelectProductState() {};

    @Override
    public void chooseProduct(int productCode, VendingMachine vendingMachine) {
        Item item = vendingMachine.getProductItem(productCode);
        System.out.println("Item choosen: " + item.getName() + " , Price: " + item.getPrice());

        int totalAmount = vendingMachine.getTotalAmount();

        if (totalAmount < item.getPrice()) {
            System.out.println("Insufficient Funds | Initiating refund of: " + this.getFullRefund(vendingMachine));
            vendingMachine.setVendingMachineState(new IdleState(vendingMachine));
            return;
        }

        System.out.println("Initiating your change: " + this.getChange(totalAmount, item.getPrice()));
        vendingMachine.setVendingMachineState(new DispenseState(vendingMachine, productCode));
    }

    @Override
    public void onPressCancelButton(VendingMachine vendingMachine) {
        System.out.println("Returning Amount: " + this.getFullRefund(vendingMachine));
        vendingMachine.setVendingMachineState(new IdleState(vendingMachine));
    }

    @Override
    public int getFullRefund(VendingMachine vendingMachine) {
        return vendingMachine.getTotalAmount();
    }

    @Override
    public int getChange(int userTotalAmount, int productAmount) {
        return (userTotalAmount - productAmount);
    }
}
