package lld.VendingMachine.VendingMachineState;

import lld.VendingMachine.Enums.Coin;
import lld.VendingMachine.VendingMachine;

public class HasMoneyState extends VendingMachineState {
    public HasMoneyState() {};

    @Override
    public void insertingCoin(Coin coin, VendingMachine vendingMachine) {
        vendingMachine.addCoin(coin);
    }

    @Override
    public void onPressSelectProductButton(VendingMachine vendingMachine) {
        vendingMachine.setVendingMachineState(new SelectProductState());
    }

    @Override
    public void onPressCancelButton(VendingMachine vendingMachine) {
        System.out.println("Returned amount: " + this.getFullRefund(vendingMachine));
        vendingMachine.setVendingMachineState(new IdleState(vendingMachine));
    }

    @Override
    public int getFullRefund(VendingMachine vendingMachine) {
        int totalAmount = 0;

        for (Coin coin: vendingMachine.getCoinList()) {
            totalAmount += coin.getValue();
        }

        return (totalAmount);
    }
}
