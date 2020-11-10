public class LanguageTester{
	public static void main(String[] values)
	{
		String pl="JAVA";
		Language convertedPL=Language.valueOf(pl);
		System.out.println(convertedPL);
		
		Language[] allPL=Language.values();
		System.out.println(allPL.length);
		
		for(int start=0;start<allPL.length;start++)
		{
			System.out.println("index " + start);
		   
			System.out.println("Language enum Value " + allPL[start]);
		}
	}
}