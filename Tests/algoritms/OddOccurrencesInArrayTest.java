package algoritms;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class OddOccurrencesInArrayTest {
  protected int[] array;
  OddOccurrencesInArray odd;

  @Before
  public void setUp() throws Exception {
    odd = new OddOccurrencesInArray();
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void testPositiveArray() {
    int[] ar = {1,3,5,7,9,1,5,3,7};
    int result =  odd.solution(ar);
    assertEquals(9, result);
  }
  
  @Test
  public void testNegativArray() {
    int[] ar = {1,1,1,1,1,1,1,1,0};
    assertEquals(-1, odd.solution(ar));
  }

}
