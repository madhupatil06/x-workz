public class StateTester{
	public static void main(String[] values)
	{
		String stateName="KARNATAKA";
		State convertedState=State.valueOf(stateName);
		System.out.println(convertedState);
		
		State[] allStates=State.values();
		System.out.println(allStates.length);
		
		for(int start=0;start<allStates.length;start++)
		{
			System.out.println("index " + start);
		
			System.out.println("State enum Value " + allStates[start]);
		}
	}
}