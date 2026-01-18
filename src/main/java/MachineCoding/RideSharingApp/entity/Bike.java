package MachineCoding.RideSharingApp.entity;

public class Bike extends Vehicle {

    public Bike(String numberPlate) {
        super(numberPlate);
    }

    @Override
    public int perKmFare() {
        return 10;
    }
}
