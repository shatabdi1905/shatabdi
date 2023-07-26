package dineshCoding;

import java.util.Scanner;

public class TwoSum {

	public int [] getInputArray(int n) {
		
		int array[] = new int[n];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements: ");
		for(int i=0;i<n;i++) {
			array[i] = sc.nextInt();
		}
		return array;
	}
	
	public void printTwoSum(int array[], int target) {
		
		int i=0,j=array.length-1;
		while((array[i]+ array[j] != target)) {
			if(j==-1 || i==array.length) {
				System.out.println("Not found");
				return;
			}
			if(array[i] + array[j] < target)
				i++;
			else if(array[i] + array[j] > target)
				j--;
			if(i==j && array[i]+ array[j] ==target)
				continue;
			
		}
		System.out.println("The indices are: " + i + "and " + j);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array: ");
		int n = sc.nextInt();
		TwoSum twObj = new TwoSum();
		int [] array = twObj.getInputArray(n);
		System.out.println("Enter the target: ");
		int target = sc.nextInt();
		twObj.printTwoSum(array, target);
		
	}

}
