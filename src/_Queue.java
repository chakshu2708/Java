import java.util.Queue;
import java.util.LinkedList;


public class _Queue {

	public static void main(String[] args) {
		Queue<Integer> numbers = new LinkedList<>();
		
		numbers.offer(1);
		numbers.offer(2);   //offer->push
		numbers.offer(3);
		System.out.println("Queue: " + numbers);
		
		int accessedNumber = numbers.peek();  //peek -> first value
		System.out.println("Accessed Element: " + accessedNumber);
		
		int removedNumber = numbers.poll();    //poll->pop
		System.out.println("Removed Element: " + removedNumber);
		
		System.out.println("Updated Queue: " + numbers);
	}

}
