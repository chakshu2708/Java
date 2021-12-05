import java.util.regex.*;


public class RegEx3 {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("[amn]", "abcd"));
		System.out.println(Pattern.matches("[amn]", "a"));
		System.out.println(Pattern.matches("[amn]", "aammnna"));
		System.out.println(Pattern.matches("[^a-zA-Z && ^0-9 ]", "("));
	}

}

//[] this bracket denote only one charactar
// [^amn] then except this 3 char we will match other then this 3
//[a-zA-Z] every alphabet will work
//[a-z&&[^mn]] except m n everthing will work
//[0-9] this will except numerical value btw this numbers