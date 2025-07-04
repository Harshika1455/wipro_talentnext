package java_fundamentals;
import java.util.*;
public class question16 {

	public static void main(String[] args) {
		// TODO Auto-generated metpackage java_fundamentals;
		
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter a number: ");
		        int num = sc.nextInt();
		        boolean isPrime = true;

		        if (num <= 1) {
		            isPrime = false; // 0 and 1 are not prime numbers
		        } else {
		            for (int i = 2; i <= Math.sqrt(num); i++) {
		                if (num % i == 0) {
		                    isPrime = false;
		                    break;
		                }
		            }
		        }

		        if (isPrime) {
		            System.out.println(num + " is a Prime number.");
		        } else {
		            System.out.println(num + " is NOT a Prime number.");
		        }

		        sc.close();
		    }
}

		