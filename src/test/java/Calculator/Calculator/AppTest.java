package Calculator.Calculator;
import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest 
{
	@Test
	public void Methodtochecksum() {
		int result;
		result = App.sum(2, 2);
			assertEquals(4,result);
			System.out.println("Testcase for sum has passed");	
	}
	
	@Test
	public void Methodtocheckdiff() {
		int result;
		result = App.diff(4,2);
			assertEquals(2,result);
			System.out.println("Testcase for Difference has passed");	
	}
	
	@Test
	public void Methodtocheckmultiplication() {
		int result;
		result = App.multiplication(2,2);
			assertEquals(4,result);
			System.out.println("Testcase for Multiplication has passed");	
	}
	@Test
	public void Methodtocheckdivision() {
		int result;
		result = App.division(4,2);
			assertEquals(2,result);
			System.out.println("Testcase for Division has passed");	
	}
}
