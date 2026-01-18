package MachineCoding.RideSharingApp.strategy.matching;

import MachineCoding.RideSharingApp.entity.Driver;
import MachineCoding.RideSharingApp.entity.Rider;
import MachineCoding.RideSharingApp.repository.DriverRepository;

public class RandomStrategy implements RideMatchingStrategy {
    private final DriverRepository driverRepository;

    public RandomStrategy(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }
    @Override
    public Driver findDriver(Rider rider) {
        return driverRepository.getAllDrivers().get(0);
    }
}
