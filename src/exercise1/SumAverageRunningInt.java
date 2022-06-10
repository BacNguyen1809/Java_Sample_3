/*
	* @author bacng
	* @ Date Jun 10, 2022
*/
package exercise1;

public class SumAverageRunningInt {

	public static void main(String[] args) {
		int lowerbound = 5;
		int upperbound = 10;
		int sum = 0;
		int count = 0;
		double avg =0;
		for(int i = lowerbound; i<=upperbound;i++) {
			sum = sum +i;
			count++;
		}
		avg = (double) sum /(count);
		System.out.println("Average of all "+ (count) + " first numbers "+avg);

	}

}
