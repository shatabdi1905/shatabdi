package medium;

public class TwoNumbersSumToTargetInSortedArray {
	public static int[] twoSum(int[] numbers, int target) {
        int [] res = new int[2];
        
        if(numbers.length==2){
            res[0]= 1;
            res[1] =2;
            return res;
        }
        int low=0,high=numbers.length-1;
        while(low<high){
            int sum = numbers[low] + numbers[high];
            if(sum==target){
                res[0] = low+1;
                res[1]= high+1;
                break;
            }
            else if(sum> target)
                high--;
            else{
                low++;
            }
        }    
        return res;
    }
	public static void main(String []args)
	{
		int [] nums = new int[] {5,25,75};
		int target = 100;
		int [] res = twoSum(nums, target);
		for(int i=0;i<res.length;i++)
			System.out.print(res[i] + " ");

	}
}
