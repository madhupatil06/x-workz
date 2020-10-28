public class Result{
	public static String report(double percentage)
	{
		System.out.println("Report method invoked");
		
		if(percentage<100 && percentage>=90){
			System.out.println("A");
			return "A";
		}
		if(percentage>=80 && percentage<90){
			System.out.println("B");
			return "B";
		}
		if(percentage>=70 && percentage<80){
			System.out.println("C");
			return "C";
		}
		if(percentage>=60 && percentage<70){
			System.out.println("D");
			return "D";
		}
		if(percentage>=50 && percentage<60){
			System.out.println("E");
			return "E";
		}
		return "F";
	}
}

