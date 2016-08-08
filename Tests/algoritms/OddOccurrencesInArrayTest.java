package algoritms;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class OddOccurrencesInArrayTest {
  protected OddOccurrencesInArray odd;

  @Before
  public void setUp() throws Exception {
    odd = new OddOccurrencesInArray();
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void testPositiveArray() {
    int[] ar = {9, 3, 9, 3, 9, 7, 9};
    int result =  odd.solution(ar);
    assertEquals(7, result);
  }
  
  @Test
  public void testEvenNumberOfArray() {
    int[] ar = {1,1,1,1,1,1,1,1};
    assertEquals(-1, odd.solution(ar));
  }

  @Test
  public void testN201() {
    int[] ar = new int[201];
    ar[134] = 700;
    assertEquals(700, odd.solution(ar));    
  }
}
