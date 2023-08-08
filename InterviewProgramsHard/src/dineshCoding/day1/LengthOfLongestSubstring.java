package dineshCoding.day1;

public class LengthOfLongestSubstring {

	public int lengthOfLongestSubstringBruteForce(String s) {
    
		int maxLen =0;
		
		for(int i=0;i< s.length();i++) {
			StringBuilder currentSubstring = new StringBuilder();
			
			for(int j=i;j< s.length();j++) {
				if(currentSubstring.indexOf(String.valueOf(s.charAt(j))) != -1) {
					break;
				}
				currentSubstring.append(s.charAt(j));
				maxLen = Math.max(maxLen, currentSubstring.length());
				
			}
		}
		return maxLen;
    }
	
	public int lengthOfLongestSubstring(String s) {
	    
		int maxLen =0;
		
		for(int left =0, right =0; right < s.length();right ++){
			char currChar = s.charAt(right);
			int indexOfFirstOccurrenceInSubstring = s.indexOf(currChar, left);
			if(indexOfFirstOccurrenceInSubstring != right) {
				left = indexOfFirstOccurrenceInSubstring + 1;				
			}
			maxLen = Math.max(maxLen, right-left+1);
			
			
		}
		return maxLen;
    }
	public static void main(String[] args) {
		
		LengthOfLongestSubstring obj = new LengthOfLongestSubstring();
		System.out.println(obj.lengthOfLongestSubstring("abcabcabac"));
		
	}

}
