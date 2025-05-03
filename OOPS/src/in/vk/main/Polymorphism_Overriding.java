package in.vk.main;

public class Polymorphism_Overriding {

	public void sleep() {
		System.out.println("You should sleep now");
	}
}

class a extends Polymorphism_Overriding{
	
	@Override
	public void sleep() {
		System.out.println("Im not sleeping");
	}
	
	public static void main(String[] args) {
		Polymorphism_Overriding p = new Polymorphism_Overriding();
		
		p.sleep();
	}
}
