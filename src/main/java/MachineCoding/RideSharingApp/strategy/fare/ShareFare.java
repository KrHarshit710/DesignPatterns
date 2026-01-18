package MachineCoding.RideSharingApp.strategy.fare;

import MachineCoding.RideSharingApp.entity.Vehicle;

public class ShareFare implements FareCalculationStrategy{
    @Override
    public double getFare(Vehicle vehicle, double distance) {
        return vehicle.perKmFare() * distance * 0.5;
    }
}
