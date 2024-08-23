package assignment;

import java.util.Scanner;

public class UserInfo {
	private String name;
	private String[] nameArray;
	private String userID;
	Scanner sc = new Scanner(System.in);
	public void enterName() {
		
		System.out.print("Name (Include first name and surname) : ");
		name = sc.nextLine();
		nameArray = name.split(" ");
		generateUserID();
		
	}
	
	public boolean checkName() {
		return name.contains(" ");
	}
	
	public void generateUserID() {
		if (checkName()) 
			userID = this.name.charAt(0) + (nameArray[nameArray.length - 1]);
		else
			userID = "guest";
	}
	
	public String getName() {
		return name;
	}
	
	public String getUserID() {
		return userID;
	}
	
}

