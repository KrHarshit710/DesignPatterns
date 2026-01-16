package FactoryPattern;

public class RedisFactory implements ICacheFactory{

    public ICache getCache(String evictionPolicy)
    {
        if(evictionPolicy.equals(Constants.LEAST_RECENTLY_USED))
            return new RedisLRUCache();
        else if(evictionPolicy.equals(Constants.LEAST_FREQUENTLY_USED))
            return new RedisLFUCache();
        else
            return null;
    }
}
