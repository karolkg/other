package algoritms;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MinPerimeterRectangleTest {
  MinPerimeterRectangle r;

  @Before
  public void setUp() throws Exception {
    r = new MinPerimeterRectangle();
  }

  @Test
  public void testCorrectValue() {
    assertEquals(40, r.solution(100));
  }
  
  @Test
  public void testZeroValue() {
    assertEquals(0, r.solution(0));
  }
  
  @Test
  public void testOneValue() {
    assertEquals(4, r.solution(1));
  }
  
  @Test
  public void testPrimeValue() {
    assertEquals(28, r.solution(13));
  }

}
