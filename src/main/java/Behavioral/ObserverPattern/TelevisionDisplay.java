package Behavioral.ObserverPattern;

public class TelevisionDisplay implements Observer {
    private final WeatherStation weatherStation;

    public TelevisionDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void somethingChanged() {
        System.out.println("Temperature Displayed on Television : " +  weatherStation.getTemperature());
    }
}
