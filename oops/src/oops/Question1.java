package oops;
import java.util.*;
 class Box {
	double length;double width;double height;
	Box(double l,double w,double h){
		length=l;
		width=w;
		height=h;
	}
	double volume() {
		return length*width*height;
		
	}
 }
	public class Question1 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter width of the box: ");
			double width = sc.nextDouble();
			System.out.print("Enter height of the box: ");
			double height = sc.nextDouble();
			System.out.print("Enter depth of the box: ");
			double depth = sc.nextDouble();
			Box myBox = new Box(width, height, depth);

			System.out.print(myBox.volume());

		}
	}

	
