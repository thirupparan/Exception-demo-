
public class ThrowsDemo {
	public static void divide(int a, int b) throws ArithmeticException {
		int c = a / b;
		System.out.println("c value is " + c);
		// if(b==0) throw new ArithmeticException
	}
}
