package dineshCoding.day4;

import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters {

	 public List<String> commonChars(String[] words) {
	  
		 int wordLetterCount[][] = new int[words.length][26];
		 int wordCounter=0;
		 for(String word: words) {
			 
			 for(int i=0;i< word.length();i++) {
				 wordLetterCount[wordCounter][word.charAt(i)-97]++;
			 }
			 wordCounter++;
		 }
		 List<String> result = new ArrayList<>();
		 
		 for(int col=0;col<26;col++) {
			 int firstWordCount=wordLetterCount[0][col];
			 int row=1; 
			 for(;row<words.length;row++) {
				 if(wordLetterCount[row][col]!=0) {
					firstWordCount = Math.min(firstWordCount, wordLetterCount[row][col]);
					continue;
				 }
				 else 
					 break;
			 }
			 char c = (char)('a'+col);
			 if(firstWordCount!=0 && row==words.length) {
				for(int i=1;i<=firstWordCount;i++)
					result.add(Character.toString(c));
			 }
		 }
		 return result;
    }
	 
	 public static void main(String[] args) {
		 FindCommonCharacters obj= new FindCommonCharacters();
		 String [] words = {"cool","lock","cook"};
		 
		 List<String> res = obj.commonChars(words);
		 for(String i: res)
			 System.out.println(i);
	}

}
