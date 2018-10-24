/*Learning how static and non-static methods work when it comes to objects*/

package static_methods;

public class HelloWorld{
	public static void main(String args[]) {
		GoodbyeWorld.print();//static method being called in a static way (no objects) 
	}
	
	public void print() {
		System.out.println("Hello world");
	}
}
