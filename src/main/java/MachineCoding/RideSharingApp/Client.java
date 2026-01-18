package MachineCoding.RideSharingApp;

import MachineCoding.RideSharingApp.entity.*;
import MachineCoding.RideSharingApp.repository.DriverRepository;
import MachineCoding.RideSharingApp.service.RideBookingService;
import MachineCoding.RideSharingApp.service.RideMatchingService;
import MachineCoding.RideSharingApp.strategy.fare.NormalFare;
import MachineCoding.RideSharingApp.strategy.matching.NearestStrategy;
import MachineCoding.RideSharingApp.strategy.matching.RandomStrategy;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Location hsr = new Location(17.235, 29.123);
        Location bellandur = new Location(21.123, 22.45);
        Location sarjapur = new Location(25.467, 32.123);
        Location somasundarpalaya = new Location(18.467, 28.89);

        Driver ramesh = new Driver("Ramesh", hsr, new Car("KA014949"));
        Driver saroj = new Driver("Saroj", bellandur, new Car("KA092134"));
        Driver suresh = new Driver("Suresh", bellandur, new Bike("KA012222"));

        Rider harshit = new Rider("Harshit", somasundarpalaya);

        DriverRepository driverRepository = new DriverRepository();
        RideBookingService rideBookingService = new RideBookingService(driverRepository, new RideMatchingService(new NearestStrategy(driverRepository)));
        rideBookingService.registerDriver(ramesh);
        rideBookingService.registerDriver(saroj);
        rideBookingService.registerDriver(suresh);

        Ride ride = rideBookingService.bookRide(harshit, new NormalFare(), 8);

        System.out.println(ride);

        Thread.sleep(5000);

        rideBookingService.completeRide(ride);

    }
}
