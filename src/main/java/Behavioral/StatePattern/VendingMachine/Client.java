package Behavioral.StatePattern.VendingMachine;

public class Client {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(new IdleState());
        vendingMachine.pressInsertCoin();
        vendingMachine.acceptCoin(new Coin(10));
        vendingMachine.pressSelectProduct();
        vendingMachine.acceptProductCode("COKE");
        vendingMachine.pressDispense();
        vendingMachine.dispenseProduct();

        vendingMachine.pressInsertCoin();
        vendingMachine.acceptCoin(new Coin(20));
        vendingMachine.pressSelectProduct();
        vendingMachine.acceptProductCode("CHIPS");
        vendingMachine.pressCancel();

    }
}
