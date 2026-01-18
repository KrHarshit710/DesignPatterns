package MachineCoding.RideSharingApp.entity;

import MachineCoding.RideSharingApp.observer.Observer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Rider implements Observer {
    private String name;
    private Location location;

    @Override
    public void notify(RideStatus rideStatus){
        System.out.println("Hey " + this.name + " ride " + rideStatus);
    }
}
