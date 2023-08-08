package dineshCoding.day3;

public class BuildArrayFromPermutation {


	public int[] buildArray(int[] nums) {
        
		int [] res = new int[nums.length];
		
		for(int i=0;i< nums.length;i++) {
			res[i] = nums[nums[i]];
		}
		return res;
    }
	public static void main(String[] args) {
	
		BuildArrayFromPermutation obj = new BuildArrayFromPermutation();
		int [] array = {5,0,1,2,3,4};
		int [] res = obj.buildArray(array);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i] + " ");
		}
	}

}
