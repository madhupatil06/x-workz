package com.xworkz.basics;

import javax.print.DocFlavor.STRING;

public class StringTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstname="Madhu";
		String name=firstname.concat(" Patil");
		System.out.println(name);
		
		char alphabet=name.charAt(2);
		System.out.println(alphabet);
		
		name=name.toUpperCase();
		System.out.println(name);
		
		name=name.toLowerCase();
		System.out.println(name);
		
			
		String newName=name.substring(6);
		System.out.println(newName);
		

	}

}


