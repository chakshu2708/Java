import java.util.Scanner;

class Student1
{
	String name;
	int roll;
	double fees;
	
	Student1(String name,int roll,double fees)
	{
		this.name = name;
		this.roll = roll;
		this.fees = fees;
	}
	
	void display()
	{
		System.out.println(roll+" "+name+" "+fees);
	}
}
public class This1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name, Roll Number and Fees of Student1: ");
		Student1 s1 = new Student1( sc.nextLine(),sc.nextInt(),sc.nextDouble() );
		
		sc.nextLine();
		System.out.println("Enter Name, Roll Number and Fees of Student1: ");
		Student1 s2 = new Student1( sc.nextLine(),sc.nextInt(),sc.nextDouble() );
		
		s1.display();
		s2.display();
	}
		

	}

