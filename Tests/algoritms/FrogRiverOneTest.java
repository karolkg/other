package algoritms;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FrogRiverOneTest {
  FrogRiverOne frog;

  @Before
  public void setUp() throws Exception {
    frog = new FrogRiverOne();
  }

  @Test
  public void testCorrectArray() {
    int[] a = {1,2,3,4,5,6,7,8,9,10};
    assertEquals(6, frog.solution(7, a));
  }
  
  @Test
  public void testNoJump() {
    int[] a = {1,2,3,4,5,4,3,2,1,2,3,4,5,};
    assertEquals(-1, frog.solution(6, a));
  }
  
  @Test
  public void testEmpty() {
    int[] a = {};
    assertEquals(-1, frog.solution(1, a));
  }

}
