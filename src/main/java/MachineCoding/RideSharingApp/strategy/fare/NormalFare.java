package MachineCoding.RideSharingApp.strategy.fare;

import MachineCoding.RideSharingApp.entity.Vehicle;

public class NormalFare implements FareCalculationStrategy{
    @Override
    public double getFare(Vehicle vehicle, double distance) {
        return vehicle.perKmFare() * distance;
    }
}
