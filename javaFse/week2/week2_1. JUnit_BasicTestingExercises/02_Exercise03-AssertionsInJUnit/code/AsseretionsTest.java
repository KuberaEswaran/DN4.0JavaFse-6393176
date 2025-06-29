

import static org.junit.Assert.*;

import org.junit.Test;

public class AsseretionsTest {

	@Test
	public void test() {
		//Assert equals
		assertEquals(5, 2 + 3);
		
		//Assert true
		assertTrue(5 > 3);
		
		//Assert false
		assertFalse(5 < 3);
		
		//Assert null
		assertNull(null);
		
		//Assert not null
		assertNotNull(new Object());
		
	}

}
