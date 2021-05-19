package exercise5;

public class Rectangle {
	
	/*fields */
	private int length; /*make fields private */
	private int breadth;
	
	/*constructeur */
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
		
	/*to string*/
	public String toString() { /*first string is the type of the return*/
		return "(" + length + ","+ breadth +")";
	}
	
	/*methode de calcul*/
	public int getArea() {
		return length * breadth;
	}
	
	/*getter du field length*/
	public int getLength() {
		return length;
	}
	
	/*setter du field length*/
	public void setLength(int length) {
		this.length = length;
	}
	
	/*getter du field breadth*/
	public int getBreadth() {
		return breadth;
	}
	
	/*setter du field breadth*/
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

}
