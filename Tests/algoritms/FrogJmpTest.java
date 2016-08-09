package algoritms;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FrogJmpTest {
	protected FrogJmp frog;

	@Before
	public void setUp() throws Exception {
		frog = new FrogJmp();
	}

	@Test
	public void testEqual() {
		assertEquals(3,frog.solution(10,70,20));
	}
	
	@Test
	public void testNotEqual() {
		assertEquals(3, frog.solution(10, 85, 30));
	}

}
