package MachineCoding.RideSharingApp.observer;

import MachineCoding.RideSharingApp.entity.RideStatus;

public interface Observer {
    void notify(RideStatus rideStatus);
}
