public class Dress{
	
	public static void wearing(int number){
		System.out.println("invoked wearing with one parameters ");
		System.out.println("number :"+number);
	}

	public static void wearing(int number,String colour){
		System.out.println("invoked wearing with two parameters ");
		System.out.println("number :"+number);
		System.out.println("colour :"+colour);
	}	
	
	public static void wearing(String number,String colour){
		System.out.println("invoked wearing with two string parameters ");
		System.out.println("number :"+number);
		System.out.println("colour :"+colour);
	}
	
	public static void wearing(String colour,int number){
		System.out.println("invoked wearing with two parameters ");
		System.out.println("colour :"+colour);
		System.out.println("number :"+number);
	}
	
}