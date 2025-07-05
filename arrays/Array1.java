package java_fundamentals;
import java.util.*;
public class Array1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
		}
		int avg=sum/n;
		System.out.println(sum);
		System.out.print(avg);

	}}
