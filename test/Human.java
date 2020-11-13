public class Human{
	public static void appearance(int height){
		System.out.println("invoked appearance with one parameters ");
		System.out.println("height :"+height);
	}

	public static void appearance(int height,String colour){
		System.out.println("invoked appearance with two parameters ");
		System.out.println("height :"+height);
		System.out.println("colour :"+colour);
	}	
	
	public static void appearance(String height,String colour){
		System.out.println("invoked appearance with two string parameters ");
		System.out.println("height :"+height);
		System.out.println("colour :"+colour);
	}
	
	public static void appearance(String colour,int height){
		System.out.println("invoked appearance with two parameters ");
		System.out.println("colour :"+colour);
		System.out.println("height :"+height);
	}
	
}