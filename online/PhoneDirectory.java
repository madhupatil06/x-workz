package com.xworkz.online;

public class PhoneDirectory {
	private static String[] phoneNumbers = { "7030673046", "9902583162", "7825623542", "9902534625", "7362584625",
			"9738654258" };
	public static void search(String number) {
	
		System.out.println("Total numbers available " + phoneNumbers.length);
		System.out.println("arg1 :" + number);
		boolean numberFound = false;
		for (int count = 0; count < phoneNumbers.length; count++) {
			
			String num = phoneNumbers[count];
			if (num.equals(number)) {
				numberFound = true;
				break;
			} else {
				numberFound = false;
			}

		}

		if (numberFound) {
			System.out.println("phoneNumbers is found ");
		} else {
			System.out.println("phoneNumbers is not found");
		}
		

	}

	public static int totalNumbers() {
		return phoneNumbers.length;
	}


}
