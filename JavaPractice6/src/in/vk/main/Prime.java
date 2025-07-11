package in.vk.main;

public class Prime {
	
	public boolean prime(int n) {
		if(n % 2 == 0) return false;
		if(n < 2) return false;
		for(int i = 2; i< Math.sqrt(n); i++) {
			if( n % i == 0) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
        Prime solution = new Prime();
        int n = 17;
        System.out.println(n + " is prime: " + solution.prime(n)); // Output: 17 is prime: true
    }

}
