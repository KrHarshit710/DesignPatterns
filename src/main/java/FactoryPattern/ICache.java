package FactoryPattern;

public interface ICache {
	
	void add();
	
	int get();
	
	void evict();

}
