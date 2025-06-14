package in.vk.main;

public class Box<T> {
	private T content;
	
	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}

	public static void main(String[] args) {
		Box<String> b1 = new Box<>();
		b1.setContent("asdfghjkl");
		System.out.println(b1.getContent());
		
		Box<Integer> b2 = new Box<Integer>();
		b2.setContent(12);
		System.out.println(b2.getContent());
	}

}
