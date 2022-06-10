/*
	* @author bacng
	* @ Date Jun 10, 2022
*/
package exercise2;

import java.util.Scanner;

public class ArrayContains {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input the length of Array: ");
		int len = Integer.parseInt(scanner.nextLine());
		String[] stringArray = new String[len];
		//input values for stringArray
		for(int i=0;i<stringArray.length;i++) {
			System.out.println("Enter the value of Array["+i+"]");
			stringArray[i] = scanner.nextLine();	
		}
		//check stringArray contain specific value or not
		String check =  "No contain";
		System.out.println("Enter value want to check: ");
		String value = scanner.nextLine();
		for(int i=0; i<stringArray.length;i++) {
			if(stringArray[i].equalsIgnoreCase(value)) {
				check = "Contained";
			}
		}
		scanner.close();
		System.out.println("Check '"+value+"' in Array: "+check);
	}
	

}
