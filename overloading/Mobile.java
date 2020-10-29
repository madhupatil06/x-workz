public class Mobile{
	
	public static void call(int number){
		System.out.println("invoked call with one parameters ");
		System.out.println("number :"+number);
	}

	public static void call(int number,String personName){
		System.out.println("invoked call with two parameters ");
		System.out.println("number :"+number);
		System.out.println("personName :"+personName);
	}	
	
	public static void call(String number,String personName){
		System.out.println("invoked call with two parameters ");
		System.out.println("number :"+number);
		System.out.println("personName :"+personName);
	}
	
	public static void call(String personName,int number){
		System.out.println("invoked call with two parameters ");
		System.out.println("personName :"+personName);
		System.out.println("number :"+number);
	}
	
}