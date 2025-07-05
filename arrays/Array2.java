package java_fundamentals;

import java.util.*;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		

		int max = arr[0];
		int min = arr[0];
		for(int i=1;i<n;i++) {
			arr[i]=sc.nextInt();
		}

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		System.out.println("Maximum Value: " + max);
		System.out.println("Minimum Value: " + min);
	}

}
