package codesdope;
import static java.lang.Math.sqrt;
public class Triangle {
	double side1;
	double side2;
	double side3;
	
	
	public double perimeter() {
		return this.side1 + this.side2 + this.side3;
	}
	
	public double area() {
		double p = perimeter()/2;
		return sqrt(p*(p-this.side1)*(p-this.side2)*(p-this.side3));
		
	}
	 
}
