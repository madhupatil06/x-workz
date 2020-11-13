public class MethodTesting
{
	public static void main(String[] args)
	{
		//here we are passing argument 
		displayName("X-workz");
		
	}
	//declaring method with parameter name which returns the string value
	public static String displayName(String name){
		System.out.println("Name is "+name);
		return name;
	}
}