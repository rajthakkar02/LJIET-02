package circle;
import java.util.*;
public class Circle {
	private double radius;
	private double area;
	private double circumfrence;
	final double PI = 3.14;
	
	public void setData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		this.radius = sc.nextDouble();
		double area = PI * radius *radius;
		double circumfrence = 2 * PI * radius;
		System.out.println("Area :"+area);
		System.out.println("Circumfrence : "+circumfrence);
				
	}

}
