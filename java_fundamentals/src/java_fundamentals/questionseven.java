package java_fundamentals;
import java.util.*;

public class questionseven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter values separated by space (or press Enter for no values):");
        String input = sc.nextLine();
        
        if (input.trim().isEmpty()) {
            System.out.println("No values");
        } else {
            String[] values = input.split("\\s+");
            for (int i = 0; i < values.length; i++) {
                System.out.print(values[i]);
                if (i < values.length - 1) {
                    System.out.print(",");
                }
            }
        }

        sc.close();
    }
}
