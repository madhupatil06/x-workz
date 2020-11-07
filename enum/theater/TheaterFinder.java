public class TheaterFinder{
	
	public static void main(String[] names){
		System.out.println("Invoked main");
		
		bestTheater(Theater.PVR);
		System.out.println("EXIT :: main");
	}
	
	public static void bestTheater(Theater theaterName)
	{
		System.out.println("Invoked bestTheater");
		switch(theaterName){
			case PVR:
				System.out.println("case is "+theaterName);
				System.out.println("Rating of the "+theaterName+ " theater is 5");
				break;
			
			case INOX:
				System.out.println("case is "+theaterName);
				System.out.println("Rating of the "+theaterName+ " theater is 5");
				break;
				
			case CINEPOLIS:
				System.out.println("case is "+theaterName);
				System.out.println("Rating of the "+theaterName+ " theater is 5");
				break;
				
			case RAVI:
				System.out.println("case is "+theaterName);
				System.out.println("Rating of the "+theaterName+ " theater is 4");
				break;
				
			case MANASA:
				System.out.println("case is "+theaterName);
				System.out.println("Rating of the "+theaterName+ " theater is 4");
				break;
				
		}
		
		System.out.println("EXIT :: bestTheater");
		
	}
}