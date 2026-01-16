package FactoryPattern;

public interface ICacheFactory {
    ICache getCache(String evictionPolicy);
}
