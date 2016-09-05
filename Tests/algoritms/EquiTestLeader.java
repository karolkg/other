package algoritms;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EquiTestLeader {
  EquiLeader e;

  @Before
  public void setUp() throws Exception {
    e = new EquiLeader();
  }

  @Test
  public void testCorrectArray() {
    int[] a = { 4, 4, 2, 5, 3, 4, 4, 4 };
    assertEquals(3, e.solution(a));
  }
  
  @Test
  public void testOneElement() {
    int[] a = { 4 };
    assertEquals(0, e.solution(a));
  }
  
  @Test
  public void testTwoElementsNoEqui() {
    int[] a = { 4,2 };
    assertEquals(0, e.solution(a));
  }
  
  @Test
  public void testTwoElementsEqui() {
    int[] a = { 4,4 };
    assertEquals(1, e.solution(a));
  }

}
