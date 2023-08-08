package dineshCoding.day2;

public class RemoveDuplicatesFromSortedArray26 {

	 public int removeDuplicates(int[] nums) {
        int right =0, left=0; 
		for( ; right < nums.length;) {
			 
			 if(nums[left] != nums[right]) {
				 left++;
				 int temp = nums[right];
				 nums[right] = nums[left];
				 nums[left] = temp;				 
			 }
			 right++;
		 }
		 return left+1;   
	 }
	
	public static void main(String[] args) {
		
		RemoveDuplicatesFromSortedArray26 obj = new RemoveDuplicatesFromSortedArray26();
		int arr[] = {0,0,1,1,1,2,2,3,3,4};
		
		System.out.println(obj.removeDuplicates(arr));

	}

}
