package BuilderPatternTest;

import BuilderPattern.CarWithBuilder;
import BuilderPattern.CarWithConstructor;
import BuilderPattern.CarWithLombokBuilder;
import BuilderPattern.components.Engine;
import BuilderPattern.components.Fuel;
import BuilderPattern.components.Seat;
import BuilderPattern.components.Stearing;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        CarWithConstructor carWithConstructor = new CarWithConstructor(new Engine(),new Fuel(), new ArrayList<Seat>(), new Stearing());

        CarWithLombokBuilder carWithLombokBuilder = CarWithLombokBuilder.builder()
                .engine(new Engine())
                .fuel(new Fuel())
                .seats(new ArrayList<Seat>())
                .stearing(new Stearing())
                .build();

        CarWithBuilder carWithBuilder = CarWithBuilder.builder()
                .engine(new Engine())
                .withSteering(new Stearing())
                .withSeats(new ArrayList<Seat>())
                .withFuel(new Fuel())
                .build();

        System.out.println(carWithLombokBuilder.toString());

        System.out.println(carWithBuilder.toString());
    }
}