package in.vk.main;

interface lambda{
	public int add(int a,int b);
}

public class LM1 {

	public static void main(String[] args) {
		lambda l = (a,b) -> a+b;
		int result = l.add(23, 45);
		System.out.println(result);
	}
}
