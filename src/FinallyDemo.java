
public class FinallyDemo {

	public static void main(String[] args) {

		int a = 50, b = 5;

		FinallyDemo fb = new FinallyDemo();
		fb.divide(a, b);
	}

	private float divide(int a, int b) {
		try {
			return a / b;
		}
		finally {
			System.out.println("finally block dominates return");
		}
	}

}
