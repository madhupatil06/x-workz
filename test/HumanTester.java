public class HumanTester{
	public static void main(String[] args){
		
		System.out.println("Invoked main");
		
		Human.appearance(5);
		
		Human.appearance("Black",5);
		
		Human.appearance(5,"Black");
		Human.appearance("5","White");
		
		System.out.println("EXIT:: main");
		
	}

}