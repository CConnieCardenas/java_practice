package codesdope;

import static java.lang.Math.sqrt;

public class Triangle2 {
	int side1;
	int side2;
	int side3;

	public Triangle2(int side1, int side2, int side3) {
		/*
		 * I need to declare the variables outside the methods so other methods can
		 * access them
		 */
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;

	}

	public int perimeter() {
		return this.side1 + this.side2 + this.side3;
	}

	public double area() {
		double p = perimeter() / 2;
		System.out.println("ici" + p);
		return sqrt(p * (p - this.side1) * (p - this.side2) * (p - this.side3));
	}

	public static void main(String[] args) {
		Triangle2 triangle_2_1 = new Triangle2(3, 4, 5);
		Triangle2 triangle_2_2 = new Triangle2(7, 2, 6);

		System.out.println(triangle_2_1.perimeter());
		System.out.println(triangle_2_2.perimeter());
		System.out.println(triangle_2_1.area());
		System.out.println(triangle_2_2.area());
		System.out.println("hello" + 1 / .2 + "regarder");

	}
}
