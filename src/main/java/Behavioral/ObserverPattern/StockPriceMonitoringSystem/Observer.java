package Behavioral.ObserverPattern.StockPriceMonitoringSystem;

public interface Observer {
    void update(String stockSymbol, double stockPrice);
}
