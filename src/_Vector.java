import java.util.Vector;


public class _Vector {

	public static void main(String[] args) {
		Vector<String> mammals = new Vector<>();
		
		mammals.add(0,"Dog");
		mammals.add(1,"Horse");
		
		mammals.add("Cat");
		System.out.println("Vector: " + mammals);
		
		mammals.remove(0);
		System.out.println("Vector:" + mammals);
		
		String get = mammals.get(1);
		System.out.println("Vector: " + get);
		
		Vector<String> animals = new Vector<>();
		animals.add("Crocodile");
		
		animals.addAll(mammals);
		System.out.println("New Vector: " + animals);

	}

}
