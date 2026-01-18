package MachineCoding.RideSharingApp.entity;

import MachineCoding.RideSharingApp.observer.Observer;

public class Driver implements Observer {
    private final String name;
    private Location location;
    private Vehicle vehicle;

    public Driver(String name, Location location, Vehicle vehicle) {
        this.name = name;
        this.location = location;
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", location=" + location +
                ", vehicle=" + vehicle +
                '}';
    }

    @Override
    public void notify(RideStatus rideStatus)
    {
        System.out.println("Hey " + this.name + " ride " + rideStatus);
    }
}
