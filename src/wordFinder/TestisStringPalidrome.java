package wordFinder;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestisStringPalidrome {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}
	
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIsPalidromeTrue() {
		isStringPalidrome_String  yes = new isStringPalidrome_String();
		String input = "civic";
		assertTrue(input + "Failed",yes.testStringWithPlus(input));
	}
	
	@Test
	public void testIsPalidromeFalse() {
		isStringPalidrome_String  yes = new isStringPalidrome_String();
		String input = "dog";
		assertFalse(input + "Failed",yes.testStringWithPlus(input));
	}

}
