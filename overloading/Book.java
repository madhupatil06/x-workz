public class Book{
	
	public static void reading(int number){
		System.out.println("invoked reading with one parameters ");
		System.out.println("number :"+number);
	}

	public static void reading(int number,String subject){
		System.out.println("invoked reading with two parameters ");
		System.out.println("number :"+number);
		System.out.println("subject :"+subject);
	}	
	
	public static void reading(String number,String subject){
		System.out.println("invoked reading with two parameters ");
		System.out.println("number :"+number);
		System.out.println("subject :"+subject);
	}
	
	public static void reading(String subject,int number){
		System.out.println("invoked reading with two parameters ");
		System.out.println("subject :"+subject);
		System.out.println("number :"+number);
	}
	
}