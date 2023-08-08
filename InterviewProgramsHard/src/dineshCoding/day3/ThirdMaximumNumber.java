package dineshCoding.day3;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class ThirdMaximumNumber {


	public int thirdMax(int[] nums) {
    		
		Integer max1=null, max2=null, max3=null;
		
		for(Integer num: nums) {
			
			if(num.equals(max1) || num.equals(max2)|| num.equals(max3))
				continue;
			
			if(max1==null || num>max1) {
				max3 = max2;
				max2=max1;
				max1=num;
			}else if(max2==null || num > max2) {
				max3 = max2;
				max2=num;
			}else if(max3==null || num > max3)
				max3 = num;
			
		}
		if(max3==null)
			return max1;
		return max3;
    }
	
	public static void main(String[] args) {

		ThirdMaximumNumber obj = new ThirdMaximumNumber();
		int [] arr = {2,2,3,1};
		System.out.println(obj.thirdMax(arr));
	}

}
