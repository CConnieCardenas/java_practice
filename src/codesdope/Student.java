package codesdope;

public class Student {

	String name;
	int roll_no;
	String phone_number;
	String address;
	
	public String printing() {
		/*here I need to use the general name of the instance*/
		return "Hello " + this.name + ", your roll number is " + this.roll_no;
	}
	
	
}
