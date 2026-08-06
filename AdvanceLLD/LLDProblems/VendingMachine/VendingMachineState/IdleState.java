package VendingMachine.VendingMachineState;

import VendingMachine.VendingMachine;

import java.util.ArrayList;

public class IdleState extends VendingMachineState {
    public IdleState(VendingMachine vendingMachine) {
        vendingMachine.setCoinList(new ArrayList<>());
    };

    @Override
    public void onPressInsertCoinButton(VendingMachine vendingMachine) {
        vendingMachine.setVendingMachineState(new HasMoneyState());
    }
}
