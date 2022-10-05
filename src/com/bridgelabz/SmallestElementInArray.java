package com.bridgelabz;

public class SmallestElementInArray {
	static int smallestElement(int[] arr) {
		int smallestNumber = arr[0];
		for(int i=0;i < arr.length;i++) {
			if (arr[i] < smallestNumber) {
				smallestNumber = arr[i];
			}
		}
		return smallestNumber;
			
	}
	
	public static void main(String[] args) {
		int[] arr = {16, 12, 23, 54, 4,52, 12,  27, 12,  3, 87};
		System.out.println(smallestElement(arr));
	}

}
