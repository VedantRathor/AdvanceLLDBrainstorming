package VendingMachine.VendingMachineState;

import VendingMachine.Item.Item;
import VendingMachine.VendingMachine;

public class DispenseState extends VendingMachineState {
    public DispenseState(VendingMachine vendingMachine, int productCode) {
        this.dispenseProduct(productCode, vendingMachine);
    }

    @Override
    public void dispenseProduct(int productCode, VendingMachine vendingMachine) {
        Item item = vendingMachine.getProductItem(productCode);
        System.out.println("Dispensing product: " + item.getName() + ", Price: " + item.getPrice());

        vendingMachine.updateProduct(productCode);
        vendingMachine.setVendingMachineState(new IdleState(vendingMachine));
    }
}
