public class Convertor
{
	public static void main(String[] convertor){
		
		String numberOfDaysInWeek = "7";
		byte convertednumberOfDaysInWeek=Byte.parseByte(numberOfDaysInWeek);
		System.out.println("Converted string to byte : "+convertednumberOfDaysInWeek);
		
		String daysInYear = "365";
		short convertedDaysInYear=Short.parseShort(daysInYear);
		System.out.println("Converted string to short :"+convertedDaysInYear);
		
		String numberOfEngineersInIndia = "15000000";
		int convertedNumberOfEngineersInIndia=Integer.parseInt(numberOfEngineersInIndia);
		System.out.println("Converted string to int :"+convertedNumberOfEngineersInIndia);
		
		String number = "9030605286";
		long convertedNum=Long.parseLong(number);
		System.out.println("Converted string to long : "+convertedNum);
		
		String degreePercentage = "70.1f";
		float convertedPercentage = Float.parseFloat(degreePercentage);
		System.out.println("Converted string to float :"+convertedPercentage);
		
		String chargeOfElectron = "1.602176662";
		double convertedChargeOfElectron = Double.parseDouble(chargeOfElectron);
		System.out.println(" Converted string to double :"+convertedChargeOfElectron);
		
		String earthIsFlat = "false";
		boolean convertedEarthIsFlat = Boolean.parseBoolean(earthIsFlat);
		System.out.println("Converted string to boolean :"+convertedEarthIsFlat);
		
		String grade = "A";
		char convertedGrade = grade.charAt(0);
		System.out.println("Converted string to char :"+convertedGrade);

	}
}