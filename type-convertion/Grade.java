public class Grade{
	public static void main(String[] marks){
		System.out.println("JVM invoked main");
		
		String grade=marks[0];
		double mark=Double.parseDouble(grade);
		String score=Result.report(mark);
		System.out.println("Grade is  "+score);
        System.out.println("EXIT:: main");

	}
}
