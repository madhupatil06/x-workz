public class AgeDefine{
	public static void main(String[] person){
		System.out.println("JVM invoked main");
		String ageValue=Age.ageDefine(25);
		System.out.println("The person with this age is  "+ageValue);
		System.out.println("Exit from main");

	}
}