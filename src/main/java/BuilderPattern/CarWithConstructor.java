package BuilderPattern;

import BuilderPattern.components.*;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
public class CarWithConstructor {
    //Required properties
    private Engine engine;
    private Fuel fuel;
    private List<Seat> seats;
    private Stearing stearing;

    // Optional properties
    private AirBag airBags;
    private CentralLock centralLock;

    private MusicSystem musicSystem;

    private SunRoof sunRoof;

    // Single Constructor
    public CarWithConstructor(Engine engine, Fuel fuel, List<Seat> seats, Stearing stearing, AirBag airBags, CentralLock centralLock, MusicSystem musicSystem, SunRoof sunRoof) {
        this.engine = engine;
        this.fuel = fuel;
        this.seats = seats;
        this.stearing = stearing;
        this.airBags = airBags;
        this.centralLock = centralLock;
        this.musicSystem = musicSystem;
        this.sunRoof = sunRoof;
    }

    // Multiple Constructor for each combination
    public CarWithConstructor(Engine engine, Fuel fuel, List<Seat> seats, Stearing stearing) {
        this.engine = engine;
        this.fuel = fuel;
        this.seats = seats;
        this.stearing = stearing;
    }

    public CarWithConstructor(Engine engine, Fuel fuel, List<Seat> seats, Stearing stearing, AirBag airBags) {
        this.engine = engine;
        this.fuel = fuel;
        this.seats = seats;
        this.stearing = stearing;
        this.airBags = airBags;
    }

    // ans so on ......
}
