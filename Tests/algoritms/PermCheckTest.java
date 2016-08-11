package algoritms;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PermCheckTest {
  PermCheck pc;

  @Before
  public void setUp() throws Exception {
    pc = new PermCheck();
  }

  @Test
  public void testRightArray() {
    int[] a = {2,4,5,1,3,6};
    assertEquals(1, pc.solution(a));
  }
  
  @Test
  public void testEmptyArray() {
    int[] a = {};
    assertEquals(0, pc.solution(a));
  }
  
  @Test
  public void testWrongArray() {
    int[] a = {1,2,3,4,5,7};
    assertEquals(0, pc.solution(a));
  }
  
  @Test
  public void testWrongFirst() {
    int[] a = {2,6,3,4,5,7};
    assertEquals(0, pc.solution(a));
  }
  
  @Test
  public void testWrongLast() {
    int[] a = {2,1,3,4,5,7};
    assertEquals(0, pc.solution(a));
  }

}
