package FactoryPattern;

public class EhCacheLRUCache implements ICache {

    @Override
    public void add() {

        System.out.println("Item added to EhCache LRU Cache");
    }

    @Override
    public int get() {

        System.out.println("Item fetched from EhCache LRU Cache");
        return 0;
    }

    @Override
    public void evict() {
        // TODO Auto-generated method stub

    }

}
