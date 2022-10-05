package com.bridgelabz;

public class LargestElementInArray {
	static int largestElement(int[] arr) {
		int largestNumber = 0;
		for(int i=0;i < arr.length;i++) {
			if (arr[i] > largestNumber) {
				largestNumber = arr[i];
			}
		}
		return largestNumber;
			
	}
	
	public static void main(String[] args) {
		int[] arr = {16, 12, 23, 54, 4,52, 12,  27, 12,  3, 87};
		System.out.println(largestElement(arr));
	}
}
