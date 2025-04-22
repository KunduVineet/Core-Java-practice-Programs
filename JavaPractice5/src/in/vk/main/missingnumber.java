package in.vk.main;

public class missingnumber {
	
	public static int missing(int []arr , int n) {
		int expectedSum = (n+1)*(n+2)/2;
		
		int actualSum = 0;
		for(int num : arr) {
			actualSum += num;
		}
		return expectedSum - actualSum;
	}
	
	public static void main(String[] args) {
		int [] arr = {3,1,2,4,5,6};
		int n = arr.length;
		
		System.out.println("Missing number is "+ missing(arr, n));
	}

}
