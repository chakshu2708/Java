import java.util.Scanner;

class Student
{
	String name;
	int roll;
	int fees;
	
	Student(String name,int roll,int fees)
	{
		this.name = name;
		this.roll = roll;
		this.fees = fees;
	}
		void data()
		{
			System.out.println("Name of student is: " + name);
			System.out.println("Roll.no of student is: " + roll);
			System.out.println("Fees of student is: " + fees);	
	}
}
public class ThisKeyWord {

	public static void main(String[] args) {
		
		int roll,fees;
		String name;
		
		System.out.println("The data s1 is:");
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine() ;
		roll = sc.nextInt();
		fees = sc.nextInt();
		
		Student S1 = new Student(name,roll,fees);
		
		System.out.println("The data s2 is:");
		sc.nextLine();
		name = sc.nextLine(); 
		roll = sc.nextInt();
		fees = sc.nextInt();
		
		
		Student S2 = new Student(name,roll,fees);

		
		S1.data();
		S2.data();
		
	}

}
