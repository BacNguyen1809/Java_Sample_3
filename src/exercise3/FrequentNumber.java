/*
	* @author bacng
	* @ Date Jun 10, 2022
*/
package exercise3;

import java.util.Scanner;

public class FrequentNumber {
	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		System.out.println("Input the length of array: ");
		int len = Integer.parseInt(scanner.nextLine());
		int[] arr = new int[len];
		String check;
		int amount =0;
		String index ="Indexs: ";
		//Input date for Array
		for(int i= 0; i<len; i++) {
			System.out.println("Input value of Array["+i+"]");
			arr[i] = Integer.parseInt(scanner.nextLine());
			//ask user want to input value for array when have done half
			if(i == (len/2)) {
				System.out.println("Do you want to continue?");
				check = scanner.nextLine();
				if(check.equalsIgnoreCase("N")) break;
			}
		}
		//count frequency of the specific value in Array, prints amount and posistions
		System.out.println("Enter the value want to research: ");
		int value = Integer.parseInt(scanner.nextLine());
		for(int i= 0; i<arr.length;i++) {
			if (value == arr[i]) {
				amount++;
				index = index + String.valueOf(i)+"\t";
			}
		}
		scanner.close();
		if(amount == 0) index =index + "Null";
		System.out.println("Amount of frequence: "+amount);
		System.out.println(index);
	}

}
