package MachineCoding.RideSharingApp.strategy.fare;

import MachineCoding.RideSharingApp.entity.Vehicle;

public interface FareCalculationStrategy {
    double getFare(Vehicle vehicle, double distance);
}
