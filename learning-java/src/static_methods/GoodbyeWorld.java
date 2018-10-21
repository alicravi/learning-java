/*Learning how static and non-static methods work when it comes to objects*/

package static_methods;

public class GoodbyeWorld {
	public static void main(String args[]) {
		HelloWorld hello = new HelloWorld();//object created in order to call the non-static method
		hello.print();
	}
	
	public static void print() {
		System.out.println("Goodbye world");
	}
}
