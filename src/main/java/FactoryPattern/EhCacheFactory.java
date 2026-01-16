package FactoryPattern;

public class EhCacheFactory implements ICacheFactory {

    public ICache getCache(String evictionPolicy)
    {
        if(evictionPolicy.equals(Constants.LEAST_RECENTLY_USED))
            return new EhCacheLRUCache();
        else if(evictionPolicy.equals(Constants.LEAST_FREQUENTLY_USED))
            return new EhCacheLFUCache();
        else
            return null;
    }
}
