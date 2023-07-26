package hard;

public class IsBadVersionBinarySearch {

	public static boolean isBadVersion(int n) {
		boolean[] input = {true};
		return input[n];
	}
	
	public static int firstBadVersion(int n) {
        int low=0,high=n,mid;
        if(n==1)
        	return n;
        while(high>=low){
            mid = low + (high-low)/2;
            boolean midVersion =  isBadVersion(mid);
            if(midVersion && !isBadVersion(mid-1))
                return mid;
            else if(midVersion==false)
                low=mid+1;
            else 
                high=mid;
        }
        return -1;
    }
	public static void main(String args[]) {
		System.out.println(firstBadVersion(1));
	}
}
