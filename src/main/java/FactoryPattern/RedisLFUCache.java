package FactoryPattern;

public class RedisLFUCache implements ICache {

	@Override
	public void add() {
		
		System.out.println("Item added to Redis LFU Cache");
	}

	@Override
	public int get() {
		
		System.out.println("Item fetched from Redis LFU Cache");
		return 0;
	}

	@Override
	public void evict() {
		// TODO Auto-generated method stub

	}

}
