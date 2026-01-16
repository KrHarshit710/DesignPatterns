package Behavioral.StatePattern.VendingMachine;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DispenseProductState implements State {
    private String productCode;
    private double coinsInserted;

    public void dispenseProduct(VendingMachine machine){
        // Validate user inserted enough coins
        // If not, set state to insertMoney with message
        // calculate amount to refund (change)
        // get product from inventory (update inventory)

        //dispense product and change.
        log.info("Collect Your Item ....");

        machine.setState(new IdleState());
    }
}
