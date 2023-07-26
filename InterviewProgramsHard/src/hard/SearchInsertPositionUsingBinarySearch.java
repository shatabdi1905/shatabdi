package hard;

public class SearchInsertPositionUsingBinarySearch {

	public int searchInsert(int[] nums, int target) {
    
		int high =nums.length-1, low =0, mid;
		
		while (low<=high) {
			mid = (high + low)/2;
			if(nums[mid]==target)
				return mid;
			else if(nums[mid]< target && mid+1<nums.length && nums[mid+1]> target)
				return mid+1;
			else if(target < nums[mid])
				high=mid-1;
			else
				low=mid;
		}
		return -1;
		
    }
	
	public static void main(String args[]) {
		
	}
}
