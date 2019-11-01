
public class ThrowsCallingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ThrowsDemo.divide(10, 0);
		} catch (ArithmeticException ae) {
			// TODO: handle exception
			ae.printStackTrace();
			System.out.println("please check your inputs");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("somthing happened ");
		}

	}
}
