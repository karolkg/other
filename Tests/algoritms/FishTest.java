package algoritms;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FishTest {
  Fish f;

  @Before
  public void setUp() throws Exception {
    f = new Fish();
  }

  @Test
  public void testCorrectArray() {
    int[] a = {1,2,5,4,3,6};
    int[] b = {0,0,0,1,0,0};
    assertEquals(4, f.solution(a, b));
    }
  
  @Test
  public void testCorrectArray2() {
    int[] a = {1,2,5,4,3,6};
    int[] b = {0,0,0,0,0,0};
    assertEquals(6, f.solution(a, b));
    }
  
  @Test
  public void testCorrectArray3() {
    int[] a = {1,2,5,4,3,6};
    int[] b = {0,0,0,0,0,1};
    assertEquals(6, f.solution(a, b));
    }
  
  @Test
  public void testCorrectArray4() {
    int[] a = {1,2,5,4,3,6};
    int[] b = {0,0,0,0,1,0};
    assertEquals(5, f.solution(a, b));
    }
}

