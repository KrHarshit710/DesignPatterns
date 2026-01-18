package MachineCoding.RideSharingApp.repository;

import MachineCoding.RideSharingApp.entity.Driver;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DriverRepository {
    private Map<String, Driver> drivers;

    public DriverRepository() {
        this.drivers = new HashMap<>();
    }

    public void addDriver(Driver driver){
        drivers.put(driver.getName(), driver);
    }

    public void updateDriver(Driver driver){
        drivers.put(driver.getName(), driver);
    }

    public List<Driver> getAllDrivers(){
        return drivers.values().stream().toList();
    }

    public Driver findDriverByName(String name){
        return drivers.get(name);
    }
}
