public class RechargeTester{
	public static void main(String[] args)
	{
		System.out.println("JVM invoked main");
		int value=Recharge.getRechargeValue();
		System.out.println("Recharge value is "+value);
		System.out.println("EXIT :: main");
		
	}
}