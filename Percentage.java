public class Percentage
{
	public static void main(String[] param)
	{
		System.out.println("This is main method");
        arrayOfPercentage();
	}
	public static void arrayOfPercentage()
	{
		float sslcPercentage = 85.33f;
		float pucPercentage = 89.34f;
		float degreePercentage = 71.00f;
		float[] percentage = {sslcPercentage,pucPercentage,degreePercentage};
		int sizeOfArray = percentage.length;
		
		System.out.println("Number of Elements "+sizeOfArray);
		
		float elementAtIndex0 = percentage[0];
		System.out.println("Element at index 0 is "+elementAtIndex0);
		
		float elementAtIndex1 = percentage[1];
		System.out.println("Element at index 1 is "+elementAtIndex1);
		
		float elementAtIndex2 = percentage[2];
		System.out.println("Element at index 2 is "+elementAtIndex2);
		
		
	}
}
