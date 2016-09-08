package algoritms;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PeaksTest {
  Peaks p;

  @Before
  public void setUp() throws Exception {
    p = new Peaks();
  }

  @Test
  public void testSolution() {
    int[] a = {1,2,1,1,1,2,1,1,2,1};
    assertEquals(3, p.solution(a));
  }

}
