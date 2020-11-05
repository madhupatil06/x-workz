public class ExampleTester{
	public static void main(String[] values){
		System.out.println("Invoked Movie class");
		System.out.println("Number of actors in a movie "+Movie.numberOfActors);
		System.out.println("Name of actor is "+Movie.actorName);
		System.out.println("movie language is " +Movie.movieLanguage);
		System.out.println("movie rating is "+Movie.rating);
		System.out.println("movie Title "+Movie.movieTitle);
		System.out.println("");
		
		System.out.println("Invoked Bank class");
		System.out.println("Branch code is "+Bank.branchCode);
		System.out.println("Bank name is "+Bank.bankName);
		System.out.println("Number of customers are "+Bank.numberOfCustomers);
		System.out.println("Bank location is "+Bank.bankLocation);
		System.out.println("");
		
		System.out.println("Invoked School class");
		System.out.println("Number of students are "+School.numberOfStudents);
		System.out.println("School name is "+School.schoolName);
		System.out.println("Number of staff are "+School.numberOfStaff);
		System.out.println("School location is "+School.schoolLocation);
		System.out.println("");
		
		System.out.println("Invoked Hospital class");
		System.out.println("Number of wards are "+Hospital.numberOfwards);
		System.out.println("Hospital name is "+Hospital.hospitalName);
		System.out.println("Number of beds are "+Hospital.numberOfBeds);
		System.out.println("Hospital location is "+Hospital.hospitalLocation);
		System.out.println("Number of doctors are "+Hospital.numberOfDotors);
		System.out.println("");
		
		System.out.println("Exit :: main");
		
		
	}

}