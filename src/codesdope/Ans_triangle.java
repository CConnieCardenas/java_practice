package codesdope;

public class Ans_triangle {

	public static void main(String[] args) {
		
		Triangle triangle1 = new Triangle();
		
		triangle1.side1 = 3;
		triangle1.side2 = 4;
		triangle1.side3 = 5;
		
		System.out.println(triangle1.perimeter());
		System.out.println(triangle1.area());
	
	}
}
