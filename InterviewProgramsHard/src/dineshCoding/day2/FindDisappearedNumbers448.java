package dineshCoding.day2;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers448 {
	 public List<Integer> findDisappearedNumbers(int[] nums) {
	    
		 int range = nums.length;
		 List<Integer> result = new ArrayList<>();
		 
		 for(int n: nums) {
			 int i = Math.abs(n) -1;
			 nums[i] = -1*  Math.abs(nums[i]);
		 }
		 for(int i=0;i<range;i++) {
			 if(nums[i]>0) {
				 result.add(i+1);
			 }
		 }
		 return result;
	 }
	 
	 public static void main(String args[]) {
		FindDisappearedNumbers448 obj = new FindDisappearedNumbers448();
		int arr[] = {4,3,2,7,8,2,3,1};
		System.out.println(obj.findDisappearedNumbers(arr));
	}
}
