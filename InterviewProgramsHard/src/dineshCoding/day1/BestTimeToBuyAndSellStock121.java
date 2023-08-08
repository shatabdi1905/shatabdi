package dineshCoding.day1;

public class BestTimeToBuyAndSellStock121 {

	public int maxProfit(int[] prices) {
		
		int maxProfit =0;
		for(int left=0,right=left+1; right < prices.length; right++) {
			if(prices[left] < prices[right])
				maxProfit = Math.max(maxProfit, prices[right] - prices[left]);
			else
				left = right;
		}		
		return maxProfit;
		
    }
	public static void main(String args[]) {
		
		BestTimeToBuyAndSellStock121 obj = new BestTimeToBuyAndSellStock121();
		int[] prices = {7,1,3,5,2,6,4};
		System.out.println(obj.maxProfit(prices));
	}
}
