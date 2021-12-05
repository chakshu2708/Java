import java.util.regex.*;

public class RegEx4 {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("[a-zA-Z0-9]{7}", "arjun27"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{7}", "arjuna27"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{7}", "arjun$27"));
		System.out.println(Pattern.matches("[a]{1}[a-zA-Z0-9]{6}", "brjun$27"));
		System.out.println(Pattern.matches("\\D*", "arjun"));
	}
	}
	


