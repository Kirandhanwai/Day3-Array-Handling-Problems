package com.bridgelabz;

public class FrequencyOfElements {
	static void checkFrequency(int[] arr) {
		boolean[] visited = new boolean[arr.length];
		for(int i=0; i<arr.length; i++) {
			int count =1;
			if(visited[i] == true) {
				continue;
			}
			for (int j=i+1; j<arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					visited[j]=true;
				}
			}
			System.out.println("Frequency of " + arr[i] + " is "+ count);
			
			}	
	}
	
	public static void main(String[] args) {
		int[] arr = {16, 12, 23, 54, 4,52, 12,  27, 12,  3, 87};
		checkFrequency(arr);
	}

}
