class Students
{
	int rollno;
	String name,course;
	float fee;
	
	Students(int rollno,String name,String course)
	{
		this.rollno = rollno;
		this.name = name;
		this.course = course;
	}
	
	Students(int rollno, String name,String course,float fee)
	{
		this(rollno,name,course);  //reusing constructor
		this.fee = fee;
	}
	
	void display()
	{
		System.out.println(rollno+" "+name+" "+course+" "+fee);
	}
}

public class this4 {

	public static void main(String[] args) {
		Students s1=new Students(111,"ankit","java");
		Students s2=new Students(112,"sumit","java",6000f);
		
		s1.display();
		s2.display();

	}

}
