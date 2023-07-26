package hard;

public class TeaTastingProblem {

	public static int[] findEachTaster(int[] capacity, int[] tasters) {
		int[] result = {};
		
		int n= capacity.length;
		if(n==0)
			return result;
		result = new int[n];
		//result[0] = Integer.min(capacity[0],tasters[0]);
		int count=0;
		while(count<n) {
			for(int i=0;i<n-count;i++) {
				int l=Integer.min(capacity[i],tasters[i+count]);
				result[i+count] += l;
				capacity[i] -= l;
			}
			count++;
		}
		return result;
	}
	
	public static void main(String args[]) {
		//int[] capacity = new int[] {10, 20, 15};
		//int[] tasters = new int[] {9,8,6};
		
		//int[] capacity = new int[] {5};
		//int[] tasters = new int[] {7};
		
		//int[] capacity = new int[] {13, 8, 5, 4};
		//int[] tasters = new int[] {3,4,2,1};
		
		int[] capacity = new int[] {1000000000, 1000000000, 1000000000};
		int[] tasters = new int[] {1,1,1000000000};
		
		int res[] = findEachTaster(capacity, tasters);
		for(int i=0;i< res.length;i++)
			System.out.print(res[i] + " ");
	}
	
}
