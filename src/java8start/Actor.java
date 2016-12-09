package java8start;

public interface Actor {
	
	void act();
	void speak();
	default void comedy(){
		System.out.println("Comedy default implementation");
	}
}
