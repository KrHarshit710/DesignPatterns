package MachineCoding.RideSharingApp.strategy.matching;

import MachineCoding.RideSharingApp.entity.Driver;
import MachineCoding.RideSharingApp.entity.Rider;
import MachineCoding.RideSharingApp.repository.DriverRepository;

public class NearestStrategy implements RideMatchingStrategy {
    private final DriverRepository driverRepository;

    public NearestStrategy(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    @Override
    public Driver findDriver(Rider rider) {
        Driver nearestDriver = null;
        double nearestDistance = Double.MAX_VALUE;
        for(Driver driver : driverRepository.getAllDrivers()){
            double distance = rider.getLocation().calculateDistance(driver.getLocation());
            if(distance < nearestDistance){
                nearestDistance = distance;
                nearestDriver = driver;
            }
        }
        return nearestDriver;
    }
}
