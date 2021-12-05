import java.util.Stack;


public class _Stack {

	public static void main(String[] args) {
		Stack<String> animals = new Stack<>();
		
		animals.push("1");
		animals.push("2");
		animals.push("3");
		
		System.out.println("Stack: " + animals);
		
		String animal = animals.peek();
		System.out.println("First Value: " + animal);
		
		String element = animals.pop();
		System.out.println("Removed Element: " + element);



	}

}
