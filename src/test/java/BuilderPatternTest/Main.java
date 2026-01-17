package BuilderPatternTest;

import Creational.BuilderPattern.CarWithBuilder;
import Creational.BuilderPattern.CarWithConstructor;
import Creational.BuilderPattern.CarWithLombokBuilder;
import Creational.BuilderPattern.components.Engine;
import Creational.BuilderPattern.components.Fuel;
import Creational.BuilderPattern.components.Seat;
import Creational.BuilderPattern.components.Stearing;

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
                .stearing(new Stearing())
                .seats(new ArrayList<Seat>())
                .fuel(new Fuel())
                .build();

        System.out.println(carWithLombokBuilder.toString());

        System.out.println(carWithBuilder.toString());
    }
}