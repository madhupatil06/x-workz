public class EmailExample{
	public static void main(String[] param){
		System.out.println("Invoked main method by JVM");
		arrayOfEmail();
		System.out.println("Exiting main method by JVM");
		
	}
	public static void arrayOfEmail(){
		System.out.println("Invoked arrayOfEmail method");
		String contactEmail="contact@x-workz.in";
		String subscribeEmail="subscribe@X-workz.in";
		String hrEmail="vinay@x-workz.in";
				
		String[] emails={contactEmail,subscribeEmail,hrEmail,"akshara@x-workz.in"};
		int sizeOfArray=emails.length;
		
		System.out.println("Total elements "+sizeOfArray);
		String elementAtIndex1=emails[1];
		 
		System.out.println("Element at index one "+elementAtIndex1);
		 
		String elementAtIndex3=emails[3];
		 
		System.out.println("Element at index three "+elementAtIndex3);
		 
				
	}
	
}