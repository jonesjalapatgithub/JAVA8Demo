package java8start;

public class Villain implements Actor {

	@Override
	public void act() {
		// TODO Auto-generated method stub

	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub

	}
	public void rude(){
		System.out.println("Villain should be rude");
	}
	public static void main(String[] args) {
		new Villain().comedy();
		
	}

}
