package SingletonPattern;

public class Test {

	public static void main(String[] args) {
		
		
		Singleton firstInstance = Singleton.getInstance();
		
		Singleton secondInstance = Singleton.getInstance();
		
		if(firstInstance == secondInstance)
			System.out.println("Correct inplementation of singleton");

	}

}
