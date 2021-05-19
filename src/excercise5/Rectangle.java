package excercise5;

public class Rectangle {
	private int length; /*make fields private */
	private int breadth;
	
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
		
	}
	public String toString() { /*first string is the type of the return*/
		return "(" + length + ","+ breadth +")";
		
	}
	int getArea() {
		return length * breadth;
	}

}
