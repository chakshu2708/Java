import java.util.regex.*;


public class RegEx5 {

	public static void main(String[] args) {
		System.out.println("metacharacters d....");
		
		System.out.println(Pattern.matches("\\d", "abc"));
		System.out.println(Pattern.matches("\\d", "6"));
		System.out.println(Pattern.matches("\\d\\d\\d", "333"));
		System.out.println(Pattern.matches("\\d", "333abc"));
		
		System.out.println("metacharacters D....");
		
		
		System.out.println(Pattern.matches("\\D", "abc"));
		System.out.println(Pattern.matches("\\D", "7"));
		System.out.println(Pattern.matches("\\D", "2221"));
		System.out.println(Pattern.matches("\\D", "333abc"));
		System.out.println(Pattern.matches("\\D", "t"));
		
		System.out.println("metacharacters D with quantifier....");
		System.out.println(Pattern.matches("\\D*", "mark"));
		System.out.println(Pattern.matches("\\D", "2724298"));
		

	}

}
//(//d is for numerical value)
//(//D is for everything except 0-9)