package java_fundamentals;
import java.util.Scanner;
public class question19 {
	public static void main(String[] args) {

	
		        Scanner sc = new Scanner(System.in);

		       

		        System.out.print("Enter a number: ");
		        int number = sc.nextInt();

		        int reversed = 0;

		        // Reverse the number using while loop
		        while (number != 0) {
		            int digit = number % 10;         // Get last digit
		            reversed = reversed * 10 + digit; // Append digit to reversed number
		            number = number / 10;             // Remove last digit
		        }

		        // Print reversed number
		        System.out.println("Reversed number: " + reversed);

		        sc.close();

		        }
}


	


