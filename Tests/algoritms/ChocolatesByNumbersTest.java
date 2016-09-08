package algoritms;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ChocolatesByNumbersTest {
  ChocolatesByNumbers c;

  @Before
  public void setUp() throws Exception {
    c = new ChocolatesByNumbers();
  }

  @Test
  public void testCorrectValues() {
    assertEquals(10, c.solution(10,3));
  }
  
  @Test
  public void testIncorrrectValues() {
    assertEquals(0, c.solution(0,0));
  }
  
  @Test
  public void testLargeValues() {
    assertEquals(10, c.solution(10000000,1000000));
  }

  @Test
  public void testLarge2Values() {
    assertEquals(947853, c.solution(947853,4453));
  }
}