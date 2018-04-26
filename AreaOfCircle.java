import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
	int radius=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the radius of circle:");
	radius=sc.nextInt();
	double area=Math.PI*radius*radius;
	
	System.out.println("Area of the circle="+area);
	
	}

}
