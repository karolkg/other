package algoritms;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MinAvgTwoSlicesTest {
  
  MinAvgTwoSlices m;

  @Before
  public void setUp() throws Exception {
    m = new MinAvgTwoSlices();
  }

  @Test
  public void testSolution5Elements() {
    int[] a = {10, 10, -1, 2, 4, -1, 2, -1};
    assertEquals(5, m.solution(a));
  }

 // @Test
  public void testSolution3Elements() {
    int[] a = {10, 2, 2};
    assertEquals(1, m.solution(a));
  }
}
