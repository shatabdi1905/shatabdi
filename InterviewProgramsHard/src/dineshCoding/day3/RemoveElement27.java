package dineshCoding.day3;

public class RemoveElement27 {

	public int removeElement(int[] nums, int val) {
        int left =0, right=0;
    
        if(nums.length==1) {
        	if(nums[0]!=val)
        		return left=1;
        }
		while(right<nums.length) {
			if(nums[left]==val) {
				if(nums[right]==val)
					right++;
				else {
					int t= nums[right];
					nums[right]=nums[left];
					nums[left] = t;
					left++;right++;
				}				
			}
			else {
				left++;
				right++;
			}
		}
		return left;
    }
	
	public static void main(String[] args) {
		RemoveElement27 obj = new RemoveElement27();
		int arr[] = {3,3};
		System.out.println(obj.removeElement(arr, 5));

	}

}
