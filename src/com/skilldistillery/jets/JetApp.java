package com.skilldistillery.jets;

import java.util.Scanner;

public class JetApp {
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		planeMenu();

	}
	
	private static void planeMenu() {
		System.out.println("Jet Menu");
		System.out.println("1. List Fleet");
		System.out.println("2. Fly all jets");
		System.out.println("3. View fastest jet");
		System.out.println("4. View jet with longest range");
		System.out.println("5. Load all cargo jets");
		System.out.println("6. Fight!");
		System.out.println("7. Add jet to Fleet");
		System.out.println("8. Remove a jet from Fleet");
		System.out.println("9. Quit");
		boolean inMenu = true;
		while(inMenu) {
		int option = kb.nextInt();
		switch (option) {
		case 1:
		//	AirField[] Jet = new AirField[5];
//			String myFile = "jets.txt";
//			System.out.println(myFile);
			inMenu = true;
			break;
		case 2:
			System.out.println("Jets taking off...");
			inMenu = true;
			break;
		case 3:
			
			inMenu = true;
			break;
		case 4:
			
			inMenu = true;
			break;
		case 5:
			System.out.println("Loading cargo...");
			inMenu = true;
			break;
		case 6:
			System.out.println("Jets attacking...");
			inMenu = true;
			break;
		case 7:
			
			inMenu = true;
			break;
		case 8:
			
			inMenu = true;
			break;
		case 9:
			System.out.println("Quiting...");
			kb.close();
			inMenu = false;
			break;
		}
		
	}
	}

}
