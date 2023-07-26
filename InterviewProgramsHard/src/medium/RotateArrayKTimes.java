package medium;

public class RotateArrayKTimes {

	public static int[] getRotatedArrayOrderNTime(int[] nums, int k) {
		int n = nums.length;
		k= k%n;
		for(int i=n-k,j=n-1;i<j;i++,j--) {
            int t = nums[i];
			nums[i] = nums[j];
			nums[j]=t;
		}
		for (int i=0,j=n-k-1;i<j;i++,j--) {
			int t = nums[i];
			nums[i] = nums[j];
			nums[j]=t;
		}
		for(int i=0, j=n-1;i<j;i++,j--) {
			int t = nums[i];
			nums[i] = nums[j];
			nums[j]=t;
		}
		return nums;
	}

	public static int[] getRotatedArrayExtraSpace(int[] nums, int k) {
		int n = nums.length;
		int [] res = new int[n];
		k= k%n;
		for(int i=0;i<n;i++) {
            if(i<k)
            	res[i] = nums[n+i-k];
            else
                res[i] = nums[i-k];
		}
		nums = res;
		return nums;
	}
	
	public static int[] getRotatedArray(int[] nums, int k) {
		int n = nums.length;
		while(k>0) {
			int temp = nums[n-1];
			int i;
			for(i=n-1;i>0;i--)
				nums[i] = nums[i-1];
			nums[i] = temp;
			k--;
		}
		return nums;
	}
	
	
	public static void main (String [] args) {
		int[] nums = new int[] {1,2,3,4,5,6,7};
		int k=3;
		int nums3[] = new int[] {1,2,3,4,5,6,7}; 
				
		int res[] = getRotatedArray(nums, k);
		for(int i=0;i<res.length;i++)
			System.out.print(res[i] + " ");

		System.out.println();

		int[] nums2 = new int[] {1,2,3,4,5,6,7};
		int res2[] = getRotatedArrayExtraSpace(nums2, k);
		for(int i=0;i<res2.length;i++)
			System.out.print(res2[i] + " ");

		System.out.println();

		int res3[] = getRotatedArrayOrderNTime(nums3, k);
		for(int i=0;i<res3.length;i++)
			System.out.print(res3[i] + " ");
}
}
