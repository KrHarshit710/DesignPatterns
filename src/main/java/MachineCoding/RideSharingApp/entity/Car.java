package MachineCoding.RideSharingApp.entity;

public class Car extends Vehicle {
    public Car(String numberPlate) {
        super(numberPlate);
    }

    @Override
    public int perKmFare() {
        return 20;
    }
}
