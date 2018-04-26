import java.util.Scanner;

public class PerimeterOfCircle {

	public static void main(String[] args) {
		int radius=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of circle:");
		radius=sc.nextInt();
		double peri=2*Math.PI*radius;
		
		System.out.println("Perimeter of the circle="+peri);
		

	}

}
