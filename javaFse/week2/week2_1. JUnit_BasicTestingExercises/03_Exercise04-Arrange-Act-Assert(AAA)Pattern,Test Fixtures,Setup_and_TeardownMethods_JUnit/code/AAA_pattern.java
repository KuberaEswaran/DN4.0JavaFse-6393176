package tests;


import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class AAA_pattern {
	
	private Calculator obj; // object to be used in all tests
	
	@Before
	public void setUp() {
		obj = new Calculator();
		System.out.println("Setup Complete");
	}
	
	@After
	public void tearDown() {  //used to clear up or reset 
		obj = null;
		System.out.println("Teardown complete");
	}
	
	@Test
	public void testAddition() {
		int result = obj.addition(2, 3);
		assertEquals(5,result);
	}
	
	@Test
	public void testSubtraction() {
		int result = obj.subtract(5,3);
		assertEquals(2,result);
	}

}
