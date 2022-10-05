package com.bridgelabz;

public class ElementsOnOddPosition {
	static void oddPosition(int[] arr) {
		for(int i=0; i<arr.length; i=i+2) {
			System.out.println(arr[i]+" ");
		}
	}
		
	public static void main(String[] args) {
		int[] arr = {16, 12, 23, 54, 4,52, 12,  27, 12,  3, 87};
		oddPosition(arr);
	}
}


