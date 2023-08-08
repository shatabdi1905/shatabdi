package dineshCoding.day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class IntersectionOfTwoArrays2nd350 {

	public int[] intersection(int[] nums1, int[] nums2) {
	    
		HashMap<Integer, Integer> commonSet = new HashMap<>();
		List<Integer> resultSet = new ArrayList<>();
	
		for(int n: nums1) {
			if(commonSet.containsKey(n))
				commonSet.put(n, commonSet.get(n)+1);
			else
				commonSet.put(n, 1);
		}
		for(int n: nums2) {
			if(commonSet.containsKey(n)) {
				resultSet.add(n);
				commonSet.put(n, commonSet.get(n)-1);
				if(commonSet.get(n)==0)
					commonSet.remove(n);
			}
		}
		int [] res = new int[resultSet.size()];
		
		for(int i=0;i< resultSet.size();i++){
			res[i] = resultSet.get(i);
		}
		return res;
    }
	
	public static void main(String[] args) {
		IntersectionOfTwoArrays2nd350 obj = new IntersectionOfTwoArrays2nd350();
		int arr1[] = {1,2,1,2};
		int arr2[] = {2,2};
		int [] res = obj.intersection(arr1, arr2);
		for(int i=0;i< res.length;i++) {
			System.out.println(res[i]);
		}
	
	}

}
