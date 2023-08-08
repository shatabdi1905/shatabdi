package dineshCoding.day3;

public class RunningSumOfArray1480 {
	public int[] runningSum(int[] nums) {
    
		int [] res = new int[nums.length];
		res[0] = nums[0];
		for(int i=1;i< nums.length;i++) {
			res[i] =res[i-1]+ nums[i];
		}
		return res; 
    }
	
	public static void main(String[] args) {
		RunningSumOfArray1480 obj = new RunningSumOfArray1480();
		int arr[] = {1,2,3,4};
		int res[] = obj.runningSum(arr);
		for(int i=0; i < res.length;i++)
			System.out.print(res[i]+ " ");

	}

}
