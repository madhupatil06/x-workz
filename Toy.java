public class Toy{
	public static void main(String[] toys)
	{
		System.out.println("JVM invoked main method from Toy");
		Car.game();
		Car.pubg();
		System.out.println("Exit from main method");
	}
}