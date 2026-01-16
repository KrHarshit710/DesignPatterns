package BuilderPattern;

import BuilderPattern.components.*;
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

        public Builder withFuel(@NonNull final Fuel fuel) {
            this.fuel = fuel;
            return this;
        }

        public Builder withSeats(@NonNull final List<Seat> seats) {
            this.seats = seats;
            return this;
        }

        public Builder withSteering(@NonNull final Stearing stearing) {
            this.stearing = stearing;
            return this;
        }

        public Builder withAirBags(@NonNull final List<AirBag> airBags) {
            this.airBags = airBags;
            return this;
        }

        public Builder withCentralLock(@NonNull final CentralLock centralLock) {
            this.centralLock = centralLock;
            return this;
        }

        public Builder withMusicSystem(@NonNull final MusicSystem musicSystem) {
            this.musicSystem = musicSystem;
            return this;
        }

        public Builder withSunRoof(@NonNull final SunRoof sunRoof) {
            this.sunRoof = sunRoof;
            return this;
        }

        public CarWithBuilder build() {
            if(this.engine == null || this.stearing == null || this.seats == null || this.fuel == null) {
                throw new RuntimeException("All required properties are not present");
            }
            CarWithBuilder car = new CarWithBuilder();
            car.engine = engine;
            car.fuel = fuel;
            car.seats = seats;
            car.stearing = stearing;
            car.airBags = airBags;
            car.musicSystem = musicSystem;
            car.centralLock = centralLock;
            car.sunRoof = sunRoof;

            return car;
        }
    }
}
