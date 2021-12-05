class Singleton
{
	private static Singleton single_instance = null;
	
	public String s;
	
	private Singleton()
	{
		s = "Hello World";
	}
	
	public static Singleton getInstance()
	{
		if(single_instance == null)
			single_instance = new Singleton();
		
		return single_instance;
	}
}
public class SingletonEx {

	public static void main(String[] args) {
		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();

		x.s = (x.s).toUpperCase();
		System.out.println("x is " + x.s);
		System.out.println("y is " + y.s);
		System.out.println("z is " + z.s);
		System.out.println("\n");
		
		z.s = (z.s).toLowerCase();
		
		System.out.println("x is " + x.s);
		System.out.println("y is " + y.s);
		System.out.println("z is " + z.s);
		
		
		
	}

}
