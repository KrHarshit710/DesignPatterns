package Behavioral.StatePattern.VendingMachine;

import lombok.extern.slf4j.Slf4j;


@Slf4j
public class AcceptCoinState implements State {

    public void acceptCoin(VendingMachine machine, Coin coin) {
        machine.getCoins().add(coin);
        log.info("You Inserted {} Rupee Coin ... Please Select Your Product...", coin.getDenomination());
    }
    public void pressSelectProduct(VendingMachine machine) {
        machine.setState(new SelectProductState());
    }

    public void pressCancel(VendingMachine machine){
        refundCoinsIfAny();
        machine.setState(new IdleState());
    }

    private void refundCoinsIfAny() {
        log.info("Please Collect Your Coins .....");
    }
}
