package hard;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MedianOfTwoSortedArrays {

	static int INT_MIN= -5555;
	static int INT_MAX = 5555;
	public static void main(String[] args) throws IOException{
		int n1, n2;
		Scanner sc = new Scanner(System.in);

		
		System.out.print("Enter size of 1st array:");
		n1 = sc.nextInt();
		System.out.println("1st array size:" + n1);

		System.out.print("Enter size of 2nd array:");
		n2 = sc.nextInt();
		System.out.println("2nd array size:" + n2);
		
		ArrayList<Integer> arr1 = new ArrayList<>(n1);
		ArrayList<Integer> arr2 = new ArrayList<>(n2);
		
		System.out.println("Enter 1st array:");
		for(int i=0;i<n1;i++) {
			arr1.add(sc.nextInt());			
		}
		System.out.println("Enter 2nd array:");
		for(int i=0;i<n2;i++) {
			arr2.add(sc.nextInt());
		}
		System.out.println("The 1st array:"+ arr1);
		System.out.println("The 2nd array:"+ arr2);
		
		int median = getMedianOfTwoArrays(arr1, arr2, n1, n2);
		System.out.println("Median is: " + median);
	}
	static int getMedianOfTwoArrays(List<Integer> arr1, List<Integer> arr2, int n1, int n2) {
//swap the 2 arrays if 1st array is larger than second array
		if (n1>n2) {
			List<Integer> arr3 = new ArrayList<Integer>(n2);
			arr3.addAll(arr2);
			arr2 = new ArrayList<Integer>(n1);
			arr2.addAll(arr1);
			arr1 = new ArrayList<Integer>(arr3);
			n1=n1+n2;
			n2=n1-n2;
			n1=n1-n2;
		}
		System.out.println("After swapping");
		System.out.println("The 1st array:"+ arr1 + " of size: "+ n1);
		System.out.println("The 2nd array:"+ arr2+ " of size: "+ n2);
		
		int low=0,high=n1;
		int cut1, cut2, l1, l2, r1, r2;
		while(low<=high) {
			cut1 = (high+low)/2;
			cut2 = (n1+n2)/2 - cut1;
			l1 = cut1==0? INT_MIN : arr1.get(cut1-1);
			l2 = cut2==0? INT_MIN : arr2.get(cut2-1);
			r1 = cut1==n1? INT_MAX : arr1.get(cut1);
			r2 = cut2==n2? INT_MAX : arr2.get(cut2);
			
			if(l1>r2)
				high=cut1-1;
			else if(l2>r1)
				low = cut1+1;
			else {
				return (n1+n2)%2==0 ? (Integer.max(l1, l2)+ Integer.min(r1, r2))/2 : Integer.min(r1, r2);
			}
		}
		
		
		return 0;
		
	}
}
