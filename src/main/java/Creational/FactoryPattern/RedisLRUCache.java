package Creational.FactoryPattern;

public class RedisLRUCache implements ICache {

	@Override
	public void add() {

		System.out.println("Item added to Redis LRU Cache");
	}

	@Override
	public int get() {

		System.out.println("Item fetched from Redis LRU Cache");
		return 0;
	}

	@Override
	public void evict() {
		// TODO Auto-generated method stub

	}

}
