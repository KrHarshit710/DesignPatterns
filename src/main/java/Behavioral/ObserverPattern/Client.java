package Behavioral.ObserverPattern;

public class Client {
    public static void main(String[] args) {
        WeatherStation bengaluruWeatherStation = new WeatherStation(17);
        PhoneDisplay myIphone = new PhoneDisplay(bengaluruWeatherStation);
        TelevisionDisplay mySonyTelevision = new TelevisionDisplay(bengaluruWeatherStation);
        bengaluruWeatherStation.subscribe(myIphone);
        bengaluruWeatherStation.subscribe(mySonyTelevision);
        bengaluruWeatherStation.setTemperature(20);
        bengaluruWeatherStation.setTemperature(23);
        bengaluruWeatherStation.unsubscribe(mySonyTelevision);
        bengaluruWeatherStation.setTemperature(21);
    }
}
