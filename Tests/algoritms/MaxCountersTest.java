package algoritms;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MaxCountersTest {
  MaxCounters mc;
  @Before
  public void setUp() throws Exception {
    mc = new MaxCounters();
  }

  @Test
  public void testEmptyArray() {
    assertArrayEquals(new int[]{0,0,0,0,0}, mc.solution(5, new int[]{}));
  }
  
  @Test
  public void test0Counters() {
    assertArrayEquals(new int[]{}, mc.solution(0, new int[]{}));
  }
  
  @Test
  public void testCounterIncrease() {
    assertArrayEquals(new int[]{2}, mc.solution(1, new int[]{1,1}));
  }
  
  @Test
  public void testMaxCounters() {
    assertArrayEquals(new int[]{3,2}, mc.solution(2, new int[]{1,2,2,3,1}));
  }

}
