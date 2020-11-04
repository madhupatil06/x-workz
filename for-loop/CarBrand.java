public class CarBrand{
	public static void main(String[] names)
	{
		System.out.println("Invoked main");
		getBrands();
	}

     public static String[] getBrands()
         {
		 System.out.println("Invoked getBrands method");
		 String[] brands={"Mahindra","Tata nano","Renault kwid","Toyota","Audi"};
		 
		 for(int start=0;start<brands.length;start++)
		 {
			System.out.println("Car brand name at index "+start+ " is "+brands[start]);
		
		 }
		 
		 return brands;
                  
         }

}