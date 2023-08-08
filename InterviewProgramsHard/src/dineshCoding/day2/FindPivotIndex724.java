package dineshCoding.day2;

public class FindPivotIndex724 {

	 public int pivotIndex(int[] nums) {
	        
		 int l=nums.length;
		 int ls[] = new int[l];
		 int rs[] = new int[l];
		 
		 for(int i=1;i<l;i++) {
			ls[i] = ls[i-1]+ nums[i-1];
			rs[l-i-1] = rs[l-i]+ nums[l-i];
		 }
		 for(int i=0;i<l;i++) {
			 if(ls[i]==rs[i])
				 return i;
		 }
		 return -1;
    }

	public static void main(String[] args) {

		FindPivotIndex724 obj = new FindPivotIndex724();
		int [] arr = {1,2,3};
		System.out.println(obj.pivotIndex(arr));
		
	}

}
