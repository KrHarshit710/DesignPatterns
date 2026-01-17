package Creational.FactoryPattern;

public class Client {

	public static void main(String[] args) {


		ICache redisLFUCache = CacheFactory.getCache(Constants.REDIS, Constants.LEAST_FREQUENTLY_USED);

		redisLFUCache.add();
		redisLFUCache.get();

		ICache ehCacheLRUCache = CacheFactory.getCache(Constants.EHCACHE, Constants.LEAST_RECENTLY_USED);
		ehCacheLRUCache.add();
		ehCacheLRUCache.get();
	}

}
