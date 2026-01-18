package MachineCoding.RideSharingApp.strategy.matching;

import MachineCoding.RideSharingApp.entity.Driver;
import MachineCoding.RideSharingApp.entity.Rider;

public interface RideMatchingStrategy {
    Driver findDriver(Rider rider);
}
