package dineshCoding.day1;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	 public int majorityElement(int[] nums) {
	
		 int n = nums.length;
		 int count=1;
		 int majorityNumber = nums[0];
		 
		 for(int i=1;i< n;i++) {
			 if(count==0) {
				 if(majorityNumber!=nums[i]) {
					 majorityNumber=nums[i];
				 }
				 count=1;					
			 }
			 else {
				 if(majorityNumber==nums[i])
					 count++;
				 else {
					 count--;
				 }				
			 }
		 }
		 return majorityNumber;
		 
    }
	
	 public static void main(String[] args) {
		MajorityElement obj = new MajorityElement();
		int [] nums = {2,2,2,4,5,6,2,2,2,2};
		System.out.println(obj.majorityElement(nums));
		
	}

}
