public class CharExample
{
	public static void main(String[] param)
	{
		System.out.println("This is main method");
        arrayOfChar();
	}
	public static void arrayOfChar()
	{
		char[] charArray = {'M','A','D','H','U','P','A','T','I','L'};
		
		int sizeOfArray = charArray.length;
		
		System.out.println("Number of Elements "+sizeOfArray);
		
		char elementAtIndex1 = charArray[1];
		System.out.println("Element at index 1 is "+elementAtIndex1);
		
		char elementAtIndex4 = charArray[4];
		System.out.println("Element at index 4 is "+elementAtIndex4);
		
		char elementAtIndex8 = charArray[8];
		System.out.println("Element at index 8 is "+elementAtIndex8);
	}
}