package algoritms;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DominatorTest {
  Dominator dom;

  @Before
  public void setUp() throws Exception {
    dom = new Dominator();
  }

  @Test
  public void testCorrectArray() {
   int[] a = {0,1,1,1,3,4,1};
   assertEquals(1, dom.solution(a));
  }
  
  @Test
  public void testEmptyArray() {
   int[] a = {};
   assertEquals(-1, dom.solution(a));
  }

}
