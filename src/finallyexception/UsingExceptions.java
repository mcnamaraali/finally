package finallyexception;

public class UsingExceptions {

	public static void main(String[] args) {
		try {
			throwException();
		}
		catch (Exception e) { //exception thrown by throwException
			System.err.println("Exception handled in Main");
		}
	}
	
	public static void throwException() throws Exception{
		try {
			System.out.println("Method throwException");
			throw new Exception();
		}
		catch (Exception e) {
			System.err.println("Exception handled by method");
			throw e;
		}
	finally {
		System.err.println("Finally executed in throwException");
		}
	}
	
	public static void doesNotThrowException() {
		try { //no throw of an exception
			System.out.println("Method does not throw");
		}
		catch (Exception e) {
			System.err.println(e);
		}
		finally {
			System.err.println("Finally exe in does not throw");
		}
		System.out.println("End of method doesNotThrowException");
	}
	
}