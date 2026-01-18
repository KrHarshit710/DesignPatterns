package MachineCoding.RideSharingApp.service;

import MachineCoding.RideSharingApp.entity.Driver;
import MachineCoding.RideSharingApp.entity.Rider;
import MachineCoding.RideSharingApp.strategy.matching.RideMatchingStrategy;

public class RideMatchingService {
    private final RideMatchingStrategy rideMatchingStrategy;

    public RideMatchingService(RideMatchingStrategy rideMatchingStrategy) {
        this.rideMatchingStrategy = rideMatchingStrategy;
    }

    public Driver findDriver(Rider rider){
        return rideMatchingStrategy.findDriver(rider);
    }

}
