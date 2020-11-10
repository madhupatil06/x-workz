public class AnimalTester{
	public static void main(String[] values)
	{
		String animalName=values[0];
		Animal convertedAnimal=Animal.valueOf(animalName);
		System.out.println(convertedAnimal);
		
		Animal[] allAnimals=Animal.values();
		System.out.println(allAnimals.length);
		
		for(int start=0;start<allAnimals.length;start++)
		{
			System.out.println("index " + start);
		
			System.out.println("Animal enum Value " + allAnimals[start]);
		}
	}
}