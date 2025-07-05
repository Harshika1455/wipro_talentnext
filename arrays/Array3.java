package java_fundamentals;
import java.util.*;
public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int m=sc.nextInt();
		boolean a=false;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(arr[i]==m) {
				a=true;
				System.out.println(i);
				break;
			}
			
			
		}
		if(a==false) {
			System.out.println(-1);
		}

	}

}
