public class ColourTester{
	public static void main(String[] values)
	{
		String colour="WHITE";
		Colour convertedColour=Colour.valueOf(colour);
		System.out.println(convertedColour);
		
		Colour[] allColours=Colour.values();
		System.out.println(allColours.length);
		
		for(int start=0;start<allColours.length;start++)
		{
			System.out.println("index " + start);
		
			System.out.println("Colour enum Value " + allColours[start]);
		}
	}
}