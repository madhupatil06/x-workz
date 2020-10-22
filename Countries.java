public class Countries{
		
	public static void main(String[] countries)
	{
		
	    System.out.println("JVM invoked main");	
        String country="Japan";		
	  
		countryName("India");		
		countryName(null);			
		countryName(country);
		
		System.out.println("main method exit");
	}
	
	
	public static void countryName(String name)
	{
		System.out.println("Invoked countryName :" + name);
		
	}
	
	
}