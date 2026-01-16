package Behavioral.StatePattern.VendingMachine;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class VendingMachine {
    private State state;
    private List<Coin> coins;

    public VendingMachine(State state) {
        this.state = state;
        coins = new ArrayList<>();
    }

    public void pressInsertCoin(){
        state.pressInsertCoin(this);
    }
    public void acceptCoin( Coin coin){
        state.acceptCoin(this, coin);
    }
    public void pressSelectProduct(){
        state.pressSelectProduct(this);
    }
    public void acceptProductCode(String pId){
        state.acceptProductCode(this, pId);
    }
    public void pressDispense(){
        state.pressDispense(this);
    }
    public void dispenseProduct(){
        state.dispenseProduct(this);
    }
    public void pressCancel(){
        state.pressCancel(this);
    }
}
