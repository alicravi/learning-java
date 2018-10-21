/*Learning how static and non-static methods work when it comes to objects*/

package static_methods;

public class HelloWorld{
	public static void main(String args[]) {
		GoodbyeWorld.print();//no need to create an object since the method being called is static
	}
	
	public void print() {
		System.out.println("Hello world");
	}
}
