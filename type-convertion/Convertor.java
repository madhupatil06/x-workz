public class Convertor
{
	public static void main(String[] convertor){
		System.out.println("Invoked main method");
		
		String fingers = "10";
		byte convertedFingers=Byte.parseByte(fingers);
		System.out.println("Converted string to byte : "+convertedFingers);
		
		String daysInYear = "365";
		short convertedDaysInYear=Short.parseShort(daysInYear);
		System.out.println("Converted string to short :"+convertedDaysInYear);
		
		String numberOfEngineersInIndia = "15000000";
		int convertedNumberOfEngineersInIndia=Integer.parseInt(numberOfEngineersInIndia);
		System.out.println("Converted string to int :"+convertedNumberOfEngineersInIndia);
		
		String populationOfIndia = "1380004385";
		long convertedPopulationOfIndia=Long.parseLong(populationOfIndia);
		System.out.println("Converted string to long : "+convertedPopulationOfIndia);
		
		String percentageOfStudent = "70.1f";
		float convertedPercentageOfStudent = Float.parseFloat(percentageOfStudent);
		System.out.println("Converted string to float :"+convertedPercentageOfStudent);
		
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