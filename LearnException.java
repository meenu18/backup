
public class LearnException {
	
	public void divide (int a, int b){
		System.out.println("First Line");
		try{
			System.out.println(a/b);
		}
		// We have to always define variable like n1 with the exception in catch 
		catch (ArithmeticException n1){
			System.out.println("Caught me exception but not terminated "+n1);
			
		}
		// finally always run
		finally {
		System.out.println("Last line");
		}
 }
}
