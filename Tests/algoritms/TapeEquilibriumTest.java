package algoritms;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TapeEquilibriumTest {
	TapeEquilibrium te;

	@Before
	public void setUp() throws Exception {
		te = new TapeEquilibrium();
		
	}

	@Test
	public void testSimplePositiveNumbers() {
		int[] tab = {5,6,2,4,1};
		assertEquals(4, te.solution(tab));
	}
		
		@Test
		public void testSimplePositiveNumbers2() {
			int[] tab = {3,1,2,4,3};
			assertEquals(1, te.solution(tab));
	}
	
	@Test
	public void testSimpleNegativeNumbers() {
		int[] tab = {-1,-2,-3,-4,-5};
		assertEquals(3,te.solution(tab));
	}

	@Test
	public void test2Elements() {
		int[] tab = {1,2};
		assertEquals(1, te.solution(tab));
	}
}
