/*basic calculator for testing input from the user with the Scanner class*/

package calculator;

import java.util.Scanner;

public class Calculator {
	public static void main(String args[]) {
		Scanner x = new Scanner(System.in);
		double fnum,snum,total;
		
		System.out.println("Enter with the first num: ");
		fnum = x.nextDouble();
		System.out.println("Enter with the second num: ");
		snum = x.nextDouble();
		total = fnum + snum;
		System.out.println("The total is "+ total);
		x.close();
	}
	
}
