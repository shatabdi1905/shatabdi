package dineshCoding.day2;

import java.util.HashSet;
import java.util.Iterator;

public class IntersectionOfTwoArrays349 {


	public int[] intersection(int[] nums1, int[] nums2) {
    
		HashSet<Integer> commonSet = new HashSet<>();
		HashSet<Integer> resultSet = new HashSet<>();
	
		for(int n: nums1)
			commonSet.add(n);
		for(int n: nums2) {
			if(commonSet.contains(n)) {
				resultSet.add(n);
				commonSet.remove(n);
			}
		}
		int [] res = new int[resultSet.size()];
		Iterator<Integer> it = resultSet.iterator();
		int i=0;
		while(it.hasNext()) {
			res[i] = it.next();
			i++;
		}
		return res;
    }
	
	public static void main(String args[]) {
		IntersectionOfTwoArrays349 obj = new IntersectionOfTwoArrays349();
		int arr1[] = {4,9,5};
		int arr2[] = {4,8,6,9,4,9};
		System.out.println(obj.intersection(arr1, arr2));
	}
}
