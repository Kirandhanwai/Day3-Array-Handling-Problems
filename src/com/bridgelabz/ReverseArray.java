package com.bridgelabz;

public class ReverseArray {
	static void reverseArray(int[] arr) {
		int temp = 0;
		//int[] arr2 = new int[arr.length]
		for (int i=0;i<arr.length/2;i++) {
			temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	public static void main(String[] args) {
		int[] arr = {16, 12, 23, 54, 4,52, 12,  27, 12,  3, 87};
		reverseArray(arr);
	}
}
