package Behavioral.ObserverPattern;


public class PhoneDisplay implements Observer {
    private final WeatherStation weatherStation;

    public PhoneDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void somethingChanged() {
        System.out.println("Temperature Displayed on Phone : " +  weatherStation.getTemperature());
    }
}
