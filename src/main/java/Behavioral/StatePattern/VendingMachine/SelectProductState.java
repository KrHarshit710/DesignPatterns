package Behavioral.StatePattern.VendingMachine;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SelectProductState implements State{
    public void acceptProductCode(VendingMachine machine, String pId){
        log.info("{} Is Available ... Please Confirm...", pId);
    }
    public void pressDispense(VendingMachine machine){
        machine.setState(new DispenseProductState());
    }
    public void pressCancel(VendingMachine machine){
        refundCoinsIfAny();
        machine.setState(new IdleState());
    }

    private void refundCoinsIfAny() {
        log.info("Please Collect Your Coins .....");
    }
}
