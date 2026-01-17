package Creational.FactoryPattern;

public interface ICacheFactory {
    ICache getCache(String evictionPolicy);
}
