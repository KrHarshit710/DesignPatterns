package Behavioral.ObserverPattern;

public interface Observable {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifySubscribers();
}
