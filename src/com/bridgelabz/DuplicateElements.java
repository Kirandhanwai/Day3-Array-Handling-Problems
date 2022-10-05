package com.bridgelabz;

public class DuplicateElements {
	static void duplicateElements(int[] arr) {
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1; j<arr.length;j++) {
				if (arr[i]== arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {16, 12, 23,3, 54,3, 4,52, 12,  27, 12,52,  3, 87};
		duplicateElements(arr);
	}

}
