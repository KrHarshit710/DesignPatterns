package Creational.SingletonPattern;

public class Client {

	public static void main(String[] args) {

		Singleton firstInstance = Singleton.getInstance();
		
		Singleton secondInstance = Singleton.getInstance();
		
		if(firstInstance == secondInstance)
			System.out.println("Correct implementation of Singleton Design Pattern");

	}

}
