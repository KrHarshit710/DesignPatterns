package Creational.BuilderPattern;

import Creational.BuilderPattern.components.*;
import lombok.NonNull;
import lombok.ToString;

import java.util.List;

// Creational Design Patterns
@ToString
public class CarWithBuilder {
    //Required properties
    private Engine engine;
    private Fuel fuel;
    private List<Seat> seats;
    private Stearing stearing;

    // Optional properties
    private List<AirBag> airBags;
    private CentralLock centralLock;

    private MusicSystem musicSystem;

    private SunRoof sunRoof;

    private CarWithBuilder(Builder builder){
        this.engine = builder.engine;
        this.fuel = builder.fuel;
        this.seats = builder.seats;
        this.stearing = builder.stearing;
        this.airBags = builder.airBags;
        this.musicSystem = builder.musicSystem;
        this.centralLock = builder.centralLock;
        this.sunRoof = builder.sunRoof;
    }

    public static Builder builder() { return new Builder();}

    public static class Builder {
        //Required properties
        private Engine engine;
        private Fuel fuel;
        private List<Seat> seats;
        private Stearing stearing;

        // Optional properties
        private List<AirBag> airBags;
        private CentralLock centralLock;
        private MusicSystem musicSystem;
        private SunRoof sunRoof;

        public Builder engine(@NonNull final Engine engine) {
            this.engine = engine;
            return this;
        }

        public Builder fuel(@NonNull final Fuel fuel) {
            this.fuel = fuel;
            return this;
        }

        public Builder seats(@NonNull final List<Seat> seats) {
            this.seats = seats;
            return this;
        }

        public Builder stearing(@NonNull final Stearing stearing) {
            this.stearing = stearing;
            return this;
        }

        public Builder airbags(@NonNull final List<AirBag> airBags) {
            this.airBags = airBags;
            return this;
        }

        public Builder centralLock(@NonNull final CentralLock centralLock) {
            this.centralLock = centralLock;
            return this;
        }

        public Builder musicSystem(@NonNull final MusicSystem musicSystem) {
            this.musicSystem = musicSystem;
            return this;
        }

        public Builder sunRoof(@NonNull final SunRoof sunRoof) {
            this.sunRoof = sunRoof;
            return this;
        }

        public CarWithBuilder build() {
            if(this.engine == null || this.stearing == null || this.seats == null || this.fuel == null) {
                throw new RuntimeException("All required properties are not present");
            }
            return new CarWithBuilder(this);
        }
    }
}
