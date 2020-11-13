public class ArrayTester
{
	public static void main(String[] args)
	{
		System.out.println("This is main method");
        arrayOfChar();
	}
	public static void arrayOfChar()
	{
		//initialization and declation of char array
		char[] charArray = {'X','W','O','R','K','Z'};
		
		//to find the length of array use length variable
		int sizeOfArray = charArray.length;
		
		System.out.println("Number of Elements "+sizeOfArray);
		
		//to read value from array use index value
		char elementAtIndex1 = charArray[1];
		System.out.println("Element at index 1 is "+elementAtIndex1);
		
		
	}
}