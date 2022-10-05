package com.bridgelabz;

public class SortArray {
	
	static void sortArray(int[] arr) {
		int temp = 0;
		for(int i = 0; i < arr.length; i++) {
			for (int j = 0; j<arr.length-1; j++) {
				if (arr[j] > arr[j+1]) {
					temp = arr[j];	// 16
					arr[j] = arr[j+1];	//arr[0] = arr[1]
					arr[j+1] = temp;
				}
			}
		}
		for (int i = 0; i <arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {16, 12, 23, 54, 4,52, 12,  27, 12,  3, 87};
		sortArray(arr);
	}

}
