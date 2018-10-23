/*Testing to see how increment and pre-increment works and the assignment operators*/

package increment_operators;

public class Test {
	public static void main(String args[]) {
		int num1 = 3;
		int num2 = 4;
		int total;
		
		total = num1 + num2;
		System.out.println(total++);//prints the value before the increment
		System.out.println(total);//prints the value already incremented
		total = 28;
		total = total/num1 + num2;
		System.out.println(total);
		total = 28;
		total /= num1 + num2; //different result from before because the compound assignment operator has the least precedence
		System.out.println(total);
	}
}
