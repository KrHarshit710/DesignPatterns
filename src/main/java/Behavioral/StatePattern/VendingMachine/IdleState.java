package Behavioral.StatePattern.VendingMachine;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IdleState implements State {
    public void pressInsertCoin(VendingMachine machine) throws UnsupportedOperationException{
        log.info("Please Insert Coin ....");
        machine.setState(new AcceptCoinState());

    }
}
