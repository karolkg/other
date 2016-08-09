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
	
	@Test
	public void test2() {
		assertEquals(4, perm.solution(new int[]{2,3,1,5}));
	}
	
	@Test
	public void tes2EmptyList() {
		assertEquals(1, perm.solution(new int[]{}));
	}
	
	@Test
	public void testMissingFirst() {
		assertEquals(1, perm.solution(new int[]{5,2,3,4}));		
	}
	
	@Test
	public void testMissingLast() {
		assertEquals(5, perm.solution(new int[]{1,2,3,4}));
	}

}
