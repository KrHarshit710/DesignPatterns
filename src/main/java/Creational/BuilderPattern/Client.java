package Creational.BuilderPattern;

import Creational.BuilderPattern.components.Engine;
import Creational.BuilderPattern.components.Fuel;
import Creational.BuilderPattern.components.Stearing;
import Creational.BuilderPattern.components.SunRoof;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        CarWithBuilder car = CarWithBuilder.builder()
                .engine(new Engine())
                .stearing(new Stearing())
                .seats(new ArrayList<>())
                .fuel(new Fuel())
                .sunRoof(new SunRoof())
                .build();

        CarWithLombokBuilder superCar = CarWithLombokBuilder.builder()
                .engine(new Engine())
                .stearing(new Stearing())
                .seats(new ArrayList<>())
                .fuel(new Fuel())
                .sunRoof(new SunRoof()).build();
    }
}
