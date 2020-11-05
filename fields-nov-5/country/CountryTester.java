public class CountryTester{
	public static void main(String[] value){
		System.out.println("Invoked main");
		
		byte number=Country.numberOfStates;
		System.out.println("number of states is "+number);
		
		number=30;
		System.out.println("updated number of states is "+number);
		
		String countryName=Country.countryName;
		System.out.println("countryName is "+countryName);
		
		countryName="USA";
		System.out.println("Updated countryName is "+countryName);
		
		String nationalLanguage=Country.nationalLanguage;
		System.out.println("nationalLanguage is "+nationalLanguage);
		
		nationalLanguage="English";
		System.out.println("Updated nationalLanguage is "+nationalLanguage);
		
		String currency=Country.currency;
		System.out.println("currency is "+currency);
		
		currency="Doller";
		System.out.println("Updated currency is "+currency);
		
		long population=Country.population;
		System.out.println("population is "+population);
		
		population=32822300;
		System.out.println("updated population is "+population);
		
	}
}