public class BookTester{
	public static void main(String[] book){
		
		System.out.println("Invoked main");
		
		Book.reading(8);
		
		Book.reading("JAVA",2);
		
		Book.reading(3,"JAVA");
		
		Book.reading("4","JAVA");
		
		System.out.println("EXIT:: main");
		
	}

}