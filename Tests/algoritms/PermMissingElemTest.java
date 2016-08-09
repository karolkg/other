package algoritms;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PermMissingElemTest {
	PermMissingElem perm;

	@Before
	public void setUp() throws Exception {
		perm = new PermMissingElem();
	}

	@Test
	public void test() {
		assertEquals(2, perm.solution(new int[]{5,1,3,6,4,7}));
	}

}
