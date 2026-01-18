package MachineCoding.RideSharingApp.entity;

public class Ride {
    private Rider rider;
    private Driver driver;
    private RideStatus rideStatus;
    private double fare;

    public Ride(Rider rider, Driver driver, double fare) {
        this.rider = rider;
        this.driver = driver;
        this.rideStatus = RideStatus.SCHEDULED;
        this.fare = fare;
    }

    public Rider getRider() {
        return rider;
    }

    public void setRider(Rider rider) {
        this.rider = rider;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public RideStatus getRideStatus() {
        return rideStatus;
    }

    public void setRideStatus(RideStatus rideStatus) {
        this.rideStatus = rideStatus;
        this.driver.notify(this.rideStatus);
        this.rider.notify(this.rideStatus);
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    @Override
    public String toString() {
        return "Ride{" +
                "rider=" + rider +
                ", driver=" + driver +
                ", rideStatus=" + rideStatus +
                ", fare=" + fare +
                '}';
    }
}
