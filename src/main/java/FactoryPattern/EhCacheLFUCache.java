package FactoryPattern;

public class EhCacheLFUCache implements ICache {

    @Override
    public void add() {

        System.out.println("Item added to EhCache LFU Cache");
    }

    @Override
    public int get() {

        System.out.println("Item fetched from EhCache LFU Cache");
        return 0;
    }

    @Override
    public void evict() {
        // TODO Auto-generated method stub

    }

}
