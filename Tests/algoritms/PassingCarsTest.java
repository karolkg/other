package algoritms;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PassingCarsTest {
	PassingCars pc;

	@Before
	public void setUp() throws Exception {
		pc = new PassingCars();
	}

	@Test
	public void testPositive() {
		int[] a = {0,1,0,1,0,1};
		assertEquals(6, pc.solution(a));
	}
	
	@Test
	public void testPairsNumbersOverLimit() {
		int[] a = new int[100000];
		for(int i = 0; i < a.length; i++) {
			if(i % 2 == 0) a[i] = 1;
			else a[i] = 0;
		}		
		assertEquals(-1, pc.solution(a));
	}
	
	@Test
	public void testEmptyArray() {
		int[] a = {};
		assertEquals(0, pc.solution(a));
	}
	
	@Test
	public void testOneZeroElementArray() {
		int[] a = {0};
		assertEquals(0, pc.solution(a));
	}
	
	@Test
	public void testOneOneElementArray() {
		int[] a = {1};
		assertEquals(0, pc.solution(a));
	}
	
	@Test
	public void testZeroOneArray() {
		int[] a = {0,1};
		assertEquals(1, pc.solution(a));
	}
	
	@Test
	public void testOneZeroArray() {
		int[] a = {1,0};
		assertEquals(0, pc.solution(a));
	}
	
	@Test
	public void testArrayLimit() {
		int[] a = new int[100000];
		a[10] = 1;
		assertEquals(10, pc.solution(a));
	}
	
	@Test
	public void tesArrayOverLimit() {
		int[] a = new int[100001];
		assertEquals(-1, pc.solution(a));
	}
	
	@Test
	public void testWrongValueInArray() {
		int[] a = {0,2};		
		assertEquals(-1, pc.solution(a));
	}

}
