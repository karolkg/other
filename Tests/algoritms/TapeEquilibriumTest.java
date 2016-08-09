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
	public void testSolution() {
		int[] tab = {1,2,3,4,5};
		assertEquals(3, te.solution(tab));
	}

	@Test
	public void test2Elements() {
		int[] tab = {1,2};
		assertEquals(1, te.solution(tab));
	}
}
