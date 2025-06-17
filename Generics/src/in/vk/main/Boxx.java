package in.vk.main;

public class Boxx<T extends Number> {
	private T content;
	
	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}

	public static void main(String[] args) {
		Boxx<Double> b1 = new Boxx<>();
		b1.setContent(12345.7890);
		System.out.println(b1.getContent());
		
		Boxx<Integer> b2 = new Boxx<Integer>();
		b2.setContent(12);
		System.out.println(b2.getContent());
	}

}
