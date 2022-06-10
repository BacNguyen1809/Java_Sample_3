/*
	* @author bacng
	* @ Date Jun 10, 2022
*/
package exercise4;

import java.util.Scanner;

public class ArrayReverse {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("input lenght of Array: ");
		int len = Integer.parseInt(scanner.nextLine());
		int[] myIntArr = new int[len];
		
		//input values into Array
		for(int i=0; i<myIntArr.length;i++) {
			System.out.println("input value of Array["+i+"]");
			myIntArr[i] = Integer.parseInt(scanner.nextLine());				
		}
		scanner.close();
		//display Original Array
		System.out.print("Original Array: ");
		for(int i=0;i<myIntArr.length;i++) {
			if(i==myIntArr.length-1) {
				System.out.println(myIntArr[i]);
			}else System.out.print(myIntArr[i]+",");
		}
		//Reverser Array
		for(int i=0;i<(myIntArr.length)/2;i++) {
			int tamp = myIntArr[i];
			myIntArr[i] =myIntArr[myIntArr.length-i-1];
			myIntArr[myIntArr.length-i-1] =tamp;
		}
		//display Reversed Array
		System.out.print("Reversed Array: ");
		for(int i=0;i<myIntArr.length;i++) {
			if(i==myIntArr.length-1) {
				System.out.println(myIntArr[i]+"s");
			}else System.out.print(myIntArr[i]+",");
		}
	}

}
