package codesdope;

public class Ans_student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		Student student2 = new Student();
		
		student1.name = "john";
		student1.roll_no = 2;
		student1.phone_number = "0876";
		student1.address = "street 1";
			
		student2.name = "sam";
		student2.roll_no = 3;
		student2.phone_number = "0976";
		student2.address = "street 2";
		
		/*here I need to use the specific name of the instance*/
		System.out.println(student1.printing());
		System.out.println(student2.printing());;
		
		
	}

		
		
		
	}

