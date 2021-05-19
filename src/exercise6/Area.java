package exercise6;

import exercise5.Rectangle;

public class Area {
//	int length;
//	int breadth;
	Rectangle rect;
	
	public void setDim(int leng, int brea) {
//		this.length = leng;
//		this.breadth = brea;
		rect = new Rectangle(leng, brea);
	}
	
	public int getArea() {
//		return length * breadth; //calcul selon exercise  
//		return rect.getLength()*rect.getBreadth(); //rectangle est une classe de stockage
		return rect.getArea(); // la classe rectangle est bien utilisée 
		
	}
}
