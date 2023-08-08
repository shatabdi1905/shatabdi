package dineshCoding.day2;

public class RemoveBut2DuplicatesFromSortedArray80 {
	public int removeDuplicates(int[] nums) {
		
        int right =0, left=0; 
		
        for( ; right < nums.length;) {
        	int count=1;
            	 
        	while(right+1< nums.length && nums[right]==nums[right+1])
        	{
        		right++;
        		count++;
        	}
        	for(int i=0;i< Math.min(2, count);i++) {
        		nums[left] = nums[right];
        		left++;
        	}
        	right++;
		 }
		 return left;   
	 }
	
	public static void main(String[] args) {
		
		RemoveBut2DuplicatesFromSortedArray80 obj = new RemoveBut2DuplicatesFromSortedArray80();
		int arr[] = {0,0,1,1,1,2,2,3,3,4};
		
		System.out.println(obj.removeDuplicates(arr));

	}

}
