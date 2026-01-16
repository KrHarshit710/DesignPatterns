package Behavioral.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable {
    private int temperature;
    private final List<Observer> subscribers;

    public WeatherStation(int temperature) {
        this.temperature = temperature;
        this.subscribers = new ArrayList<>();
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifySubscribers();
    }

    @Override
    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        subscribers.forEach(Observer::somethingChanged);
    }
}
