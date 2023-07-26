package easy;

public class MoveZeros {
	
	 public static int[] moveZeros(int[] nums) {
		 
		 int n= nums.length;
		 int i=0,j=0;
		 while(j<n) {
			 if(nums[j]==0)
				 j++;
			 else
			 {
				 int t=nums[i];
				 nums[i]= nums[j];
				 nums[j] = t;
				 i++;
			 }
		 }
		 
		 return nums;
	 }

	public static void main (String [] args) {
		int[] nums = new int[] {0, 1,0,3,12};
				
		int res[] = moveZeros(nums);
		for(int i=0;i<res.length;i++)
			System.out.print(res[i] + " ");

	}
}
