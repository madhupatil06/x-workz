public class Grade{
	public static void main(String[] marks){
		System.out.println("JVM invoked main");
		String score=Result.report(50);
		System.out.println("Grade is  "+score);
        System.out.println("EXIT:: main");

	}
}
