package lld.VendingMachine.VendingMachineState;

import lld.VendingMachine.Enums.Coin;
import lld.VendingMachine.VendingMachine;

public abstract class VendingMachineState {
    public void onPressInsertCoinButton(VendingMachine vendingMachine) {
        System.out.println("OOPS!! Something went wrong");
    }
    public void insertingCoin(Coin coin, VendingMachine vendingMachine) {
        System.out.println("OOPS!! Something went wrong");
    }
    public void onPressSelectProductButton(VendingMachine vendingMachine) {
        System.out.println("OOPS!! Something went wrong");
    }
    public void chooseProduct(int productCode, VendingMachine vendingMachine) {
        System.out.println("OOPS!! Something went wrong");
    }
    public void dispenseProduct(int productCode, VendingMachine vendingMachine) {
        System.out.println("OOPS!! Something went wrong");
    }
    public void onPressCancelButton(VendingMachine vendingMachine) {
        System.out.println("OOPS!! Something went wrong");
    }
    public int getFullRefund(VendingMachine vendingMachine) {
        System.out.println("OOPS!! Something went wrong");
        return 0;
    }
    public int getChange(int userTotalAmount, int productAmount) {
        System.out.println("OOPS!! Something went wrong");
        return 0;
    }
}
