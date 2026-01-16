package Behavioral.ObserverPattern.StockPriceMonitoringSystem;

public class Client {
    public static void main(String[] args) {
        Reliance reliance = new Reliance("RELIANCE", 100);
        Trent trent = new Trent("TRENT", 1000);
        User harshit = new User("HARSHIT");
        User sanchit = new User("SANCHIT");
        reliance.subscribe(harshit);
        reliance.subscribe(sanchit);
        trent.subscribe(harshit);
        reliance.setStockPrice(101);
        trent.setStockPrice(1010);
    }
}
