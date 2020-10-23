public class BooleanExample
{
	public static void main(String[] param)
	{
		System.out.println("This is main method");
        arrayOfBoolean();
	}
	public static void arrayOfBoolean()
	{
		boolean earthIsFlat = false;
		boolean skyIsBlue = true;
		boolean[] booleanArray = {earthIsFlat,skyIsBlue};
		
		int sizeOfArray = booleanArray.length;
		
		System.out.println("Number of Elements "+sizeOfArray);
		
		boolean elementAtIndex0 = booleanArray[0];
		System.out.println("Element at index 0 is "+elementAtIndex0);
		
		boolean elementAtIndex1 = booleanArray[1];
		System.out.println("Element at index 1 is "+elementAtIndex1);
		
	}
}
