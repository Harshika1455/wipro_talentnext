package arrays;
		import java.util.*;
		public class array5{

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				        Scanner scanner = new Scanner(System.in);

				        // Input array size
				        System.out.print("Enter the number of elements in the array: ");
				        int n = scanner.nextInt();

				        if (n < 2) {
				            System.out.println("Array must contain at least 2 elements.");
				            return;
				        }

				        // Input array elements
				        int[] arr = new int[n];
				        System.out.println("Enter the array elements:");
				        for (int i = 0; i < n; i++) {
				            arr[i] = scanner.nextInt();
				        }

				        // Sort the array
				        Arrays.sort(arr);

				        // Smallest 2 numbers
				        System.out.println("Smallest two numbers: " + arr[0] + ", " + arr[1]);

				        // Largest 2 numbers
				        System.out.println("Largest two numbers: " + arr[n - 1] + ", " + arr[n - 2]);
				
		    }

			



	}


