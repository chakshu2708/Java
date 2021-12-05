import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	int a , b ,sum=0,temp,rem ;
	System.out.println("Enter the number: ");
	a = sc.nextInt();
	temp = a;
	while(temp!=0)
	{
		rem = temp%10;
		sum = sum+(rem*rem*rem);
		temp=temp/10;
		
	}
	if(a==sum)
		System.out.println("The number is Armstrong number:");
	else
		System.out.println("The number is not Armstrong number:");
	
	}
	
	}

