import java.util.List;
import java.util.ArrayList;


public class Array_UnitList {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(1);   //Index 0
		numbers.add(2);
		numbers.add(3);
		System.out.println("List:" + numbers);
		
		int number = numbers.get(2);
		System.out.println("Accessed Element: " + number);
		
		int removedNumber = numbers.remove(1);
		System.out.println("Removed Element: " + removedNumber);
		
		System.out.println("List: "+ numbers);

	}

}