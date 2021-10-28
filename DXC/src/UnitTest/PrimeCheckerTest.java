package UnitTest;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.Before;

import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;
@RunWith(Parameterized.class)
public class PrimeCheckerTest {
	private Integer inputnumber;
	private Boolean expectedresult;
	private PrimeChecker PrimeChecker;
	
	@Before
	public void initialize() {
		PrimeChecker = new PrimeChecker();
	}
	public PrimeCheckerTest(Integer inputnumber, Boolean expectedresult) {
		this.inputnumber = inputnumber;
		this.expectedresult = expectedresult;
	}
	@Parameterized.Parameters
	public static Collection primeNumbers() {
		return Arrays.asList(new Object[][] {
			{ 2, true },
			{ 6, false },
			{ 19, true },
			{ 22, false },
			{ 23, true }
		});
	}
	@Test
	public void testPrimeChecker() {
		System.out.println("Parameterized Number is : "+ inputnumber);
	
		assertEquals(expectedresult, 
				PrimeChecker.validate(inputnumber));
	}
	
	

}
