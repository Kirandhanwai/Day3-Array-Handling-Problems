package com.bridgelabz;

public class SecondLargestNumber {
	static int secondLargest(int[] arr) {
		int firstNumber = 0;
		int secondNumber = 0;
		for(int i=0;i < arr.length;i++) {
			if (arr[i] > firstNumber) {
				secondNumber = firstNumber;
				firstNumber = arr[i];
			}
			else if (arr[i] > secondNumber && arr[i] != firstNumber) {
				secondNumber = arr[i];
				
			}
			
		}
		return secondNumber;

	}
	public static void main(String[] arg) {
		int[] arr = {16, 12, 23, 54, 4,52, 12,  27, 12,  3, 87};//
		int secondNumber = secondLargest(arr);
		if(secondNumber == 0) {
			System.out.println("No second largest number");
		}
		else {
			System.out.println("Number = "+ secondNumber);
		}
		
		//sortArray(arr);	
	
 
	}

	
	

}