package easy;

public class SortedArrays {

	public static int[] getSortedSquareArray(int[] a) { 
		int i=0,j=a.length-1, k=j;
		int[] b= new int[a.length];
		while(k>=0) {
			if(Math.abs(a[i]) == Math.abs(a[j])) {
				b[k--] = a[j]*a[j];
				if(i!=j) {
					b[k--] = a[i]*a[i];
					i++;
				}
				j--;				
			}
			else if(Math.abs(a[i]) > Math.abs(a[j])) {
				b[k--] = a[i]*a[i];
				i++;
			}
			else {
				b[k--] = a[j]*a[j];
				j--;
			}
		}
		return b;
	}
	public static void main(String args[]) {
		
		int [] a = new int[] {-7, -3, 2, 3, 11};
		int[] res = getSortedSquareArray(a);
		for(int i=0;i< res.length;i++)
			System.out.print(res[i] + " ");
	}
}
