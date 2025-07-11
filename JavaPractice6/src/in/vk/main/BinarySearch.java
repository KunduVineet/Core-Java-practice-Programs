package in.vk.main;

public class BinarySearch {
	
	public int binary(int [] nums, int target) {
		int left = 0; int right = nums.length-1;
		while(left <= right) {
			int mid = left + (right - left ) /2;
			if(nums[mid] == target) return mid;
			if(nums[mid] < target) left = mid +1;
			else right = mid-1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
        BinarySearch solution = new BinarySearch();
        int[] arr = {-1, 0, 1, 2, 3, 4, 5};
        int target = 0;
        System.out.println("Index of " + target + ": " + solution.binary(arr, target)); // Output: 2
    }

}
