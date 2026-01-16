package BuilderPattern;

import BuilderPattern.components.*;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Builder
@Getter
public class CarWithLombokBuilder {
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

    @Override
    public String toString() {
        return "CarWithLombokBuilder{" +
                "engine=" + engine +
                ", fuel=" + fuel +
                ", seats=" + seats +
                ", stearing=" + stearing +
                ", airBags=" + airBags +
                ", centralLock=" + centralLock +
                ", musicSystem=" + musicSystem +
                ", sunRoof=" + sunRoof +
                '}';
    }
}
