package Behavioral.StatePattern.VendingMachine;

public interface State {

    default void pressInsertCoin(VendingMachine machine) throws UnsupportedOperationException{
        throw new UnsupportedOperationException();
    }

    default void acceptCoin(VendingMachine machine, Coin coin) throws UnsupportedOperationException{
        throw new UnsupportedOperationException();
    }

    default void pressSelectProduct(VendingMachine machine) throws UnsupportedOperationException{
        throw new UnsupportedOperationException();
    }

    default void acceptProductCode(VendingMachine machine, String pId) throws UnsupportedOperationException{
        throw new UnsupportedOperationException();
    }

    default void pressDispense(VendingMachine machine) throws UnsupportedOperationException{
        throw new UnsupportedOperationException();
    }

    default void dispenseProduct(VendingMachine machine) throws UnsupportedOperationException{
        throw new UnsupportedOperationException();
    }

    default void pressCancel(VendingMachine machine) throws UnsupportedOperationException{
        throw new UnsupportedOperationException();
    }

}





