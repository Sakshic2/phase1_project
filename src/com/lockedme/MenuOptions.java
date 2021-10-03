package com.lockedme;

public class MenuOptions {

	public static void printWelcomeScreen(String appName, String developerName) {
		String companyDetails = String.format("\n"
				+ " Welcome to %s.com. \n" + " This application is developed by %s.\n"
				+ "\n", appName, developerName);
		String appFunction = " uses of this application :-\n"
				+ "� Retrieve  files names in the \"main\" folder\n"
				+ "� Search, add, or delete files in \"main\" folder.\n"
				+ "\n**Please  provided  correct filename for searching or deleting files.**\n";
		System.out.println(companyDetails);

		System.out.println(appFunction);
	}

	public static void displayMenu() {
		String menu = "\n\nSelect any option number from below and press Enter\n\n"
				+ "1- Retrieve all files inside \"main\" folder\n" + "2- Display menu for File operations\n"
				+ "3- Exit program\n";
		System.out.println(menu);
	}

	public static void displayFileMenuOptions() {
		String fileMenu = "\n Select any option number from below and press Enter \n"
				+ "1- Add a file to \"main\" folder\n" + "2- Delete a file from \"main\" folder\n"
				+ "3- Search for a file from \"main\" folder\n" + "4- Show Previous Menu\n" + "5- Exit program\n";

		System.out.println(fileMenu);
	}

}
