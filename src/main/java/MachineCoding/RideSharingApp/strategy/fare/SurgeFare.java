package MachineCoding.RideSharingApp.strategy.fare;

import MachineCoding.RideSharingApp.entity.Vehicle;

public class SurgeFare implements FareCalculationStrategy{
    @Override
    public double getFare(Vehicle vehicle, double distance) {
        return vehicle.perKmFare() * distance * 1.5;
    }
}
