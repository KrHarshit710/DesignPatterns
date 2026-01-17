package Creational.FactoryPattern;

// Creational Design Patterns
public class CacheFactory {
	
	public static ICache getCache(String serviceProvider, String evictionPolicy)
	{
		if(serviceProvider.equals(Constants.REDIS))
			return new RedisFactory().getCache(evictionPolicy);
		else if(serviceProvider.equals(Constants.EHCACHE))
			return new EhCacheFactory().getCache(evictionPolicy);
		else
			return null;
	}

}
