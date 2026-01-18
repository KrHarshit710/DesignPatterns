package MachineCoding.RideSharingApp.service;

import MachineCoding.RideSharingApp.entity.Driver;
import MachineCoding.RideSharingApp.entity.Ride;
import MachineCoding.RideSharingApp.entity.RideStatus;
import MachineCoding.RideSharingApp.entity.Rider;
import MachineCoding.RideSharingApp.repository.DriverRepository;
import MachineCoding.RideSharingApp.strategy.fare.FareCalculationStrategy;

public class RideBookingService {
    private final DriverRepository driverRepository;
    private final RideMatchingService rideMatchingService;

    public RideBookingService(DriverRepository driverRepository, RideMatchingService rideMatchingService) {
        this.driverRepository = driverRepository;
        this.rideMatchingService = rideMatchingService;
    }

    public void registerDriver(Driver driver){
        driverRepository.addDriver(driver);
    }

    public Ride bookRide(Rider rider, FareCalculationStrategy fareStrategy, double distance){
        // Find matching driver
        Driver driver = rideMatchingService.findDriver(rider);
        // Calculate fare
        double fare = fareStrategy.getFare(driver.getVehicle(), distance);
        // Create Ride
        return new Ride(rider, driver, fare);
    }

    public Ride completeRide(Ride ride){
        ride.setRideStatus(RideStatus.COMPLETED);
        return ride;
    }
}
