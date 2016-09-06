package algoritms;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MaxDoubleSliceSumTest {
  MaxDoubleSliceSum max;

  @Before
  public void setUp() throws Exception {
    max = new MaxDoubleSliceSum();
  }

  @Test
  public void testEmptyArray() {
    int[] a = {};
    assertEquals(0, max.solution(a));
  }
  
  @Test
  public void testMinCorrectArray() {
    int[] a = {1,2,3};
    assertEquals(0, max.solution(a));
  }
  
  @Test
  public void testCorrectArray() {
    int[] a = {1,1,2,1,1,1,1,1,1};
    assertEquals(7, max.solution(a));
  }

}
