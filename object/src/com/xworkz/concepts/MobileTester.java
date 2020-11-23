package com.xworkz.concepts;
import com.xworkz.concepts.object_concept.Mobile;

public class MobileTester {

	public static void main(String[] args) {
		Mobile mobile=new Mobile();
		mobile.model="Realme 5 pro";
		mobile.thickness=7.2f;
		mobile.ram=4;
		mobile.storage=64;
		Mobile.color="Blue";
		
		mobile.displayInfo();
		System.out.println("\n******\n");
		
		Mobile mobile1=new Mobile();
		mobile1.model="Realme 3 pro";
		mobile1.thickness=8.2f;
		mobile1.ram=4;
		mobile1.storage=64;
		Mobile.color="Black";
		
		mobile1.displayInfo();
		System.out.println("\n******\n");
		
		Mobile mobile2=new Mobile();
		mobile2.model="Samsung";
		mobile2.thickness=7.2f;
		mobile2.ram=4;
		mobile2.storage=128;
		Mobile.color="Red";
		
		mobile2.displayInfo();
		System.out.println("\n******\n");
		
		Mobile mobile3=new Mobile();
		mobile3.model="Redmi note 8 pro";
		mobile3.thickness=6.4f;
		mobile3.ram=6;
		mobile3.storage=128;
		Mobile.color="Green";
		
		mobile3.displayInfo();
		System.out.println("\n******\n");
		
		Mobile mobile4=new Mobile();
		mobile4.model="Redmi note 8";
		mobile4.thickness=6.9f;
		mobile4.ram=4;
		mobile4.storage=128;
		Mobile.color="Blue";
		
		mobile4.displayInfo();
		

	}

}
