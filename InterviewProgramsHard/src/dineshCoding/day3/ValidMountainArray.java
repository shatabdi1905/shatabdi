package dineshCoding.day3;

public class ValidMountainArray {

	 public boolean validMountainArray(int[] arr) {
	 
		 int i=0;
		 for(;i< arr.length-1;i++) {
			 if(arr[i]<arr[i+1])
				 continue;
			 else
				 break;
		 }
		 if(i==0 || i==arr.length-1)
			 return false;
		 for(int j=i;j< arr.length-1;j++) {
			 if(arr[j]> arr[j+1])
				 continue;
			 else
				 return false;
		 }
		 return true;
	 }
	 
	public static void main(String[] args) {
		ValidMountainArray obj = new ValidMountainArray();
		int [] arr = {2,1};
		System.out.println(obj.validMountainArray(arr));
	}

}
